public class LockBuffer
{
    private int value;                                //�������
    private boolean isEmpty=true;                     //value�Ƿ�Ϊ�յ��ź���
    
    public synchronized void put(int i)               //ͬ�����������������ٽ�����������ǰ����
    {
//        synchronized(this)                          //��ͬ����书����ͬ�������ٽ����Ƿ����壬������ǰ����
//    	if (!this.isEmpty)                            //��������,����7.9��Ϊʲô����
        while (!this.isEmpty)                         //��value����ʱ���ȴ�
            try
            {
                 this.wait();                         //ʹ���ø÷����ĵ�ǰ�̵߳ȴ����������Լ�
            }
            catch(InterruptedException ex) {}
        
        this.value = i;                               //��value��ʱ��value���ֵ
        this.isEmpty = false;                         //����valueΪ����״̬
        this.notify();                                //����һ���ȴ���ǰ�ٽ���Դ���߳�
    }
    /*
     * ��ϵ�58�͵�75�д�����Է��֣� ��һ�����ݱ�����value��֮�󣬽�isEmpty����ֵ��ת������notify�����߳�
     * notify֮�󣬵����ǵ�58���ǵ�75�д�����ִ�У�Ҳ������һ���ȱ����������̨������ÿһ�γ�����������ȷ����
     * ���ԲŻ�ÿ�����в�����һ���Ľ����
     */
    public synchronized int get()                     //ͬ�����������������ٽ�����������ǰ����
    {
        while (this.isEmpty)                          //��value��ʱ���ȴ�
            try
            {
                 this.wait();
            }
            catch(InterruptedException ex) {}

        this.isEmpty = true;                          //����valueΪ��״̬��������ֵ
        this.notify();                                //����һ���ȴ���ǰ�ٽ���Դ���߳�
        return this.value;                      
    }

    public static void main(String args[])
    {
        LockBuffer buffer = new LockBuffer();
        (new SendThread(buffer)).start();
        (new ReceiveThread(buffer)).start();
    }
}

class SendThread extends Thread                       //�����߳���
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

class ReceiveThread extends Thread                    //�����߳���
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
