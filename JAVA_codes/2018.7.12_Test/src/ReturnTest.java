
public class ReturnTest implements Runnable{
	private static int i=0;
	public ReturnTest()
	{
		
	}
	public void run()
	{
		try
		{
			for(i=0;i<5;i++)
		{
		      if(i==3)
		    	  return;
			System.out.println("当前线程运行了"+i+"次。");
			Thread.sleep(1000);
		}
		}
		catch(InterruptedException ev)
		{
		
			System.out.print("线程已经停止。");
			return;
		}
		
	}
	
	
	public static void main(String args[]) throws Exception
	{
		Thread thread=new Thread(new ReturnTest());
		thread.start();
	    Thread.sleep(10000);
	    System.out.println("时间到，main函数继续执行。");
		System.out.println(thread.isAlive());
		
		
		
	}
}
