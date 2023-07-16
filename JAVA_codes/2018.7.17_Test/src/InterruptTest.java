/**
 * ����δ�����Է������㣺
 * 1��main�߳����ȼ����Ը��������̣߳����������̻߳��Ǻ�main�̡߳���ͬ�����У����ֳ������̡߳�.
 * 2���ڻ���1������£���thread�߳�û��������֮ǰ���������main�߳��е���thread��interrupt���������õ�ʱ��
 * ô�����飬���ǵ�thread���е�ʱ�����ڴ�������д��catch����{...} ���Ի�ֱ���׳�
 * Ҳ����˵ ֻҪ������interrupt���� ������ʲôʱ����õģ�������õ�ʱ����ø÷������̴߳�������̬����������
 * �÷������߳̽����������ߵȴ�̬ʱ�򣬾ͻ������׳�InterruptedException�쳣��
 * @author ��������û�Է�
 *
 */
public class InterruptTest implements Runnable {
	public void run()
	{
		for(int i=0;i<100;i++)
		{ 
		   try
		   {
		
			System.out.println("Thread_1 is running..."+i);
			if(i==5)
				Thread.sleep(1);
		   }
			catch(InterruptedException ev)
			{
				System.err.println("Thread_1 stops here...");
				return;   
			}
		   }
		}
	

	public static void main(String[] args) throws Exception {
		InterruptTest t1=new InterruptTest();
		Thread thread=new Thread(t1);
		thread.start();
		thread.interrupt();
		System.out.println("We have passed the code above...");  //֤������һ�����thread_1��interrupt
		for(int i=0;i<100;i++)                                   //�����Ĵ����Ѿ����й��ˡ�
		{
			System.out.println("Running here... "+i);
		}
	}

}
