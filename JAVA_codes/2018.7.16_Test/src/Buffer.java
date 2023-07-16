public class Buffer                                        //缓冲区类
{
    private int value;                                     //共享变量，临界资源
    public void put(int value)
    {
        this.value = value;
    }
    public int get()
    {
        return this.value;
    }
}

class SendThread extends Thread                            //发送线程类
{
    private Buffer buffer;                                 //用于交换数据的共享变量
    
    public SendThread(Buffer buffer)                       //指定缓冲区
    {
        this.buffer = buffer;
    }
    
    public void run()
    {
    	synchronized(this.buffer)
    	{
        for (int i=1; i<5; i++)                            //连续向缓冲区发送若干数据
        {
            buffer.put(i);
            System.out.println(this.getClass().getName()+" put : "+i);

            try
            {
                Thread.sleep(1);
            }
            catch(InterruptedException ex) {}
        }
    	}
    }
}

class ReceiveThread extends Thread                         //接收线程类
{
    private Buffer buffer;
    
    public ReceiveThread(Buffer buffer)                    //指定缓冲区
    {
        this.buffer = buffer ;
    }
    
    public void run()        
    {
        synchronized(this.buffer)
        {
    	
    	for (int i=1; i<5; i++)                            //连续从缓冲区接收若干数据
        {
            System.out.println("\t\t\t\t"+this.getClass().getName()+" get : "+buffer.get());
            
             try
            {
            	Thread.sleep(1);
            }
            catch(InterruptedException ex) {}
        }
        }
    }

    public static void main(String args[])
    {
        Buffer buffer = new Buffer();
        (new SendThread(buffer)).start();
        (new ReceiveThread(buffer)).start();
    }
}