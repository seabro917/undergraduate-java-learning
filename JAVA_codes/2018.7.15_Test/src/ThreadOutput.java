
public class ThreadOutput extends Thread
{
	public void run()
	{
		while(true)
		{
			System.out.println("Thread_1 is  running...");
			try
			{
				Thread.sleep(1000);
			}
			catch(InterruptedException ev)
			{
				System.out.println("�����Ұ���");
			}
		}
	       // System.out.println("���е���һ���ˡ�");
	}
	
	public static void main(String[] args) 
	{
		Thread thread=new ThreadOutput();
		thread.start();
		while(true)
		{
			System.out.println("Thread_main is running...");
			try
			{
				Thread.sleep(1000);
			}
			catch(InterruptedException ev)
			{
				System.err.println("���е�main�̵߳���һ���ˡ�");
			}
		
		}

	}

}
