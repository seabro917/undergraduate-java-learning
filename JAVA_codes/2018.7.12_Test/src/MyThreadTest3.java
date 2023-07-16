
public class MyThreadTest3 extends Thread {
    volatile boolean stop = false;
    public static void main( String args[] ) throws Exception 
    {
        MyThreadTest3 thread = new MyThreadTest3();
        thread.start();
        for(int i=0;i<100;i++){
            System.out.println( "Starting thread..."+i );
        }
        Thread.sleep( 3000 );//���3s�ǲ�����main���߳�������3s��ʹthread����CPU����Դ ʹthread�߳����У�
        System.out.println( "Asking thread to stop..." );
        thread.interrupt();//ע���������interrupt�����Ķ���Ϊ���Ǵ�����thread�������thread�߳��Ƿ������
        thread.stop = true;//����߳������棬��������˱�����ɶ��˼���� �ǲ��Ǿ�������߳������� �����ô������̵߳�interrupt���� ������������������catch�������while������while����stop�������ֵ�ж� Ҳ���ù��� ֱ�ӿ�catch�����䲢��ִ��
        Thread.sleep( 3000 );//��һֱ�ɻ������һ�е�interrupt�������õ�ʱ�� ������ǰ�������е��߳���main
        System.err.println( "Stopping application..." );//�߳� Ϊʲô���õ�ǰû�������е�thread��interrupt
        //System.exit( 0 );                            //���� ���ǿ��Դ������е�catch��䲶���쳣
    }                                                  //�ǲ��ǲ��ܵ�������interrupt�������̵߳����ǲ���
                                                       //�ڱ����� ֻҪ������ ���Ҵ�������̬ ��ֱ��catch ����
    public void run() {                                //ִ��catch�е���Ӧ��䣿 ��11�к͵�12�д����ĸ���ִ��?
        while ( !stop ) 
        {
            System.out.println( "Thread running..." );
            try 
            {
                Thread.sleep( 1000 );                             //���治���Ѿ�false���� ������interrupt����ʱ���ǲ���ִ������������
            } catch ( InterruptedException e )
            {                                                     //interrupt���������̶߳���ʱthrowһ��
                System.out.println( "Thread interrupted..." );    //InterruptedException ǰ�����ǲ�����Ϊ��
                 
            }                                                     //û�е���interrupt���������Բ���catch����쳣��
        }
        System.out.println( "Thread exiting under request..." );
    }
}  
