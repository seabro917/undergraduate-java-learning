public class LockBuffer
{
    private int value;                                //共享变量
    private boolean isEmpty=true;                     //value是否为空的信号量
    
    public synchronized void put(int i)               //同步方法，方法体是临界区，锁定当前对象
    {
//        synchronized(this)                          //与同步语句功能相同，声明临界区是方法体，锁定当前对象
//    	if (!this.isEmpty)                            //本例不错,但例7.9错，为什么？？
        while (!this.isEmpty)                         //当value不空时，等待
            try
            {
                 this.wait();                         //使调用该方法的当前线程等待，即阻塞自己
            }
            catch(InterruptedException ex) {}
        
        this.value = i;                               //当value空时，value获得值
        this.isEmpty = false;                         //设置value为不空状态
        this.notify();                                //唤醒一个等待当前临界资源的线程
    }
    /*
     * 结合第58和第75行代码可以发现， 当一个数据被放在value上之后，将isEmpty变量值反转，并且notify另外线程
     * notify之后，到底是第58还是第75行代码先执行，也就是哪一句先被输出到控制台，这是每一次程序运行所不确定的
     * 所以才会每次运行产生不一样的结果。
     */
    public synchronized int get()                     //同步方法，方法体是临界区，锁定当前对象
    {
        while (this.isEmpty)                          //当value空时，等待
            try
            {
                 this.wait();
            }
            catch(InterruptedException ex) {}

        this.isEmpty = true;                          //设置value为空状态，并返回值
        this.notify();                                //唤醒一个等待当前临界资源的线程
        return this.value;                      
    }

    public static void main(String args[])
    {
        LockBuffer buffer = new LockBuffer();
        (new SendThread(buffer)).start();
        (new ReceiveThread(buffer)).start();
    }
}

class SendThread extends Thread                       //发送线程类
{
    private LockBuffer buffer;
    
    public SendThread(LockBuffer buffer)
    {
        this.buffer = buffer;
    }
    
    public void run()
    {
        for (int i=1; i<5; i++)
        {
            buffer.put(i);
            System.out.println(this.getClass().getName()+" put : "+i);
        }
    }
}

class ReceiveThread extends Thread                    //接收线程类
{
    private LockBuffer buffer;
    
    public ReceiveThread(LockBuffer buffer)
    {
        this.buffer = buffer ;
    }
    
    public void run()
    {
        for (int i=1; i<5; i++)
            System.out.println("\t\t\t\t"+this.getClass().getName()+" get : "+buffer.get());
    }
}
