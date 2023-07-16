public class Buffer                                        //��������
{
    private int value;                                     //����������ٽ���Դ
    public void put(int value)
    {
        this.value = value;
    }
    public int get()
    {
        return this.value;
    }
}

class SendThread extends Thread                            //�����߳���
{
    private Buffer buffer;                                 //���ڽ������ݵĹ������
    
    public SendThread(Buffer buffer)                       //ָ��������
    {
        this.buffer = buffer;
    }
    
    public void run()
    {
    	synchronized(this.buffer)
    	{
        for (int i=1; i<5; i++)                            //�����򻺳���������������
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

class ReceiveThread extends Thread                         //�����߳���
{
    private Buffer buffer;
    
    public ReceiveThread(Buffer buffer)                    //ָ��������
    {
        this.buffer = buffer ;
    }
    
    public void run()        
    {
        synchronized(this.buffer)
        {
    	
    	for (int i=1; i<5; i++)                            //�����ӻ�����������������
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