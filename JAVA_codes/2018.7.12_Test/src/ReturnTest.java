
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
			System.out.println("��ǰ�߳�������"+i+"�Ρ�");
			Thread.sleep(1000);
		}
		}
		catch(InterruptedException ev)
		{
		
			System.out.print("�߳��Ѿ�ֹͣ��");
			return;
		}
		
	}
	
	
	public static void main(String args[]) throws Exception
	{
		Thread thread=new Thread(new ReturnTest());
		thread.start();
	    Thread.sleep(10000);
	    System.out.println("ʱ�䵽��main��������ִ�С�");
		System.out.println(thread.isAlive());
		
		
		
	}
}
