/**
 * 测试给一个线程的线程体加上循环条件，并且在循环体中写入catch语句，测试当不满足循环条件的时候，调用线程的
 * interrupt方法，会不会不经过判断循环条件而直接执行catch之下的语句。
 * @author 海哥昨晚没吃饭
 *
 */
public class ThreadInterruptTest extends Thread {
    boolean index=true;
	public ThreadInterruptTest(boolean index)
	{
		this.index=index;
	}
	public void run()
	{
		int i=0;
		while(index)
		{
			System.out.println("Thread is running...");
			try
			{
				Thread.sleep(1000);	
				i++;
				if(i==3)
					Thread.sleep(100000);              
/*
 * 由运行的结果可以观察到，当main线程处于睡眠的4秒内，thread线程运行，当运行第三次后（花费3秒），thread也进入
 * 睡眠，接下来的1秒内无线程处于运行态。因为我设置的thread的睡眠时间很长，1秒到后main线程继续运行，调用thread
 * 的interrupt，此时thread因为正在睡眠（处于阻塞或者等待态），所以会抛出异常，并且执行catch里面的语句，并且，
 * thread会退出等待或者阻塞态，重新回到就绪态，所以我们可从控制台程序运行的结果观察到，执行catch下的输出“你别搞
 * 我啊！”语句之后，thread又回到了运行态，且不会再sleep（100000），因为它是从自己暂停的地方继续执行，i还是会每次
 * +1，但是不会再回到3，所以if语句不会判定。
 */
			}
			catch(InterruptedException ev)
			{
				System.out.println("你别搞我啊！");
				//break;    //这地方可以加上一个break试试看。
			}
		}
		System.out.println("运行这一句了。");
	}	

	public static void main(String[] args) throws Exception {
		Thread thread=new ThreadInterruptTest(true);
		thread.start();
		Thread.sleep(4000);
		thread.interrupt();
		Thread.sleep(3000);
		System.out.println("main线程运行结束。");

	}

}
