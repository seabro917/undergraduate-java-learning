
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
				System.out.println("你别搞我啊！");
			}
		}
	       // System.out.println("运行到这一句了。");
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
				System.err.println("运行到main线程的这一句了。");
			}
		
		}

	}

}
