import java.io.*;

public class LoopedStreams {
    private PipedOutputStream pipedOS = new PipedOutputStream();
    private boolean keepRunning = true;
    private ByteArrayOutputStream byteArrayOS =new ByteArrayOutputStream() {
        public void close() {
            keepRunning = false;
            try {
                super.close();
                pipedOS.close();
            }
            catch(IOException e) {                         //两个都是重写了父类的close（）方法
                // 记录错误或其他处理
                // 为简单计，此处我们直接结束
                System.exit(1);
            }
        }
    };
    private PipedInputStream pipedIS = new PipedInputStream() {
        public void close() {
            keepRunning = false;
            try    {
                super.close();   //byteArrayOS和pipedIS实际上分别是 ByteArrayOutputStream和PipedInputStream的
            }                    //派生类的实例，也即在它们的close()方法中加入了特殊的行为,所以这里是super.close()
            catch(IOException e) {
                // 记录错误或其他处理
                // 为简单计，此处我们直接结束
                System.exit(1);
            }
        }
    };
    public LoopedStreams() throws IOException 
    {
        pipedOS.connect(pipedIS);
        startByteArrayReaderThread();
    } // LoopedStreams()
    public InputStream getInputStream() 
    {
        return pipedIS;
    } // getInputStream()
    public OutputStream getOutputStream() 
    {
        return byteArrayOS;
    } // getOutputStream()
    private void startByteArrayReaderThread() 
    {
        new Thread(new Runnable() {
            public void run() {
                while(keepRunning) {
                    // 检查流里面的字节数
                    if(byteArrayOS.size() > 0) 
                    {
                        byte[] buffer = null;
                        synchronized(byteArrayOS)
                        {
                            buffer = byteArrayOS.toByteArray();
                            byteArrayOS.reset(); // 清除缓冲区
                        }
                        try 
                        {
                            // 把提取到的数据发送给PipedOutputStream
                            pipedOS.write(buffer, 0, buffer.length);
                        }
                        catch(IOException e) {
                            // 记录错误或其他处理
                            // 为简单计，此处我们直接结束
                            System.exit(1);
                        }
                    }
                    else // 没有数据可用，线程进入睡眠状态
                        try {
                            // 每隔1秒查看ByteArrayOutputStream检查新数据
                            Thread.sleep(1000);
                        }
                        catch(InterruptedException e) {}
                    }
             }
        }).start();
    } // startByteArrayReaderThread()
} // LoopedStreams