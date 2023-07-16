
public class MyThreadTest1 extends Thread
{
	private char c;
	public MyThreadTest1(String name,char c)
	{
		super(name);
		this.c=c;
	}
	public void run()
	{
		
		
			for(int i=0;i<5;i++)		
		  {
			if (i==3)
			{
				return;
			}
			System.out.print(c);
		  }
	   
	
	}
	public static void main(String args[])
	{
		System.out.println("老自真是艹了!");
		MyThreadTest1 thread1=new MyThreadTest1("呵",'草');
		MyThreadTest1 thread2=new MyThreadTest1("哼",'尼');
		MyThreadTest1 thread3=new MyThreadTest1("嘤",'玛');
		thread1.setPriority(MAX_PRIORITY);
		thread2.setPriority(NORM_PRIORITY);
		thread3.setPriority(MIN_PRIORITY);
		thread1.start();
		thread2.start();
		thread3.start();
		System.out.print(thread1.isAlive());

	}

}
