/**
 * 从这段代码可以发现两点：
 * 1、main线程优先级明显高于其他线程，但是其他线程还是和main线程“共同”运行，呈现出“多线程”.
 * 2、在基于1的情况下，在thread线程没进入运行之前我们如果在main线程中调用thread的interrupt方法，调用的时候
 * 么得事情，但是当thread运行的时候由于代码里面写了catch（）{...} 所以会直接抛出
 * 也就是说 只要调用了interrupt方法 不管是什么时候调用的（就算调用的时候调用该方法的线程处于运行态），当调用
 * 该方法的线程进入阻塞或者等待态时候，就会立马抛出InterruptedException异常。
 * @author 海哥昨晚没吃饭
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
		System.out.println("We have passed the code above...");  //证明上面一句调用thread_1的interrupt
		for(int i=0;i<100;i++)                                   //方法的代码已经运行过了。
		{
			System.out.println("Running here... "+i);
		}
	}

}
