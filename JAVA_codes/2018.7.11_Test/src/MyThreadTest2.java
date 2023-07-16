public class MyThreadTest2 {
	public static void main(String[] args) throws Exception {
		Runner1 r1 = new Runner1();		
		Thread t = new Thread(r1);		
		t.start();
		for (int i = 0; i < 3; i++) {
			if (i==1)
			{
				Thread.sleep(3000);
			}
			System.out.println("main thread :"+i);
		
		}		
	}
}
 
class Runner1 implements Runnable{
	@Override
	public void run() {		
        try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {            //main线程睡眠了3秒的开始 r1线程开始启动 启动不是先看
			e.printStackTrace();                      //try里面的睡眠5秒吗？ 所以三秒内虽然main线程被阻塞
		}                                             //r1线程也没有开始启动 但是main线程结束之后，再等2秒
        for (int i = 0; i < 3; i++) {                 //r1之前睡眠的5秒结束 r1进入就绪态 调用r1的run方法
        	System.out.println("Runner1 : " + i);     //时不还是从try开始吗？这样岂不是应该永远r1都在睡眠吗
        }
	}	                                              //上述回答：sleep方法调用相当于是线程进入阻塞或者
}                                                     //等待态 该状态结束后，线程从暂停处继续运行。
