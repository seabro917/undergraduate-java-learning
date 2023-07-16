
public class MyThreadTest3 extends Thread {
    volatile boolean stop = false;
    public static void main( String args[] ) throws Exception 
    {
        MyThreadTest3 thread = new MyThreadTest3();
        thread.start();
        for(int i=0;i<100;i++){
            System.out.println( "Starting thread..."+i );
        }
        Thread.sleep( 3000 );//这个3s是不是让main主线程先休眠3s，使thread抢到CPU的资源 使thread线程运行？
        System.out.println( "Asking thread to stop..." );
        thread.interrupt();//注意这里调用interrupt方法的对象为我们创建的thread，即检测thread线程是否堵塞。
        thread.stop = true;//如果线程阻塞面，将不会检查此变量（啥意思？） 是不是就是如果线程阻塞了 当调用此阻塞线程的interrupt方法 比如这个代码里面就算catch语句是在while里面且while是用stop这个布尔值判断 也不用管他 直接看catch里的语句并且执行
        Thread.sleep( 3000 );//我一直疑惑的是上一行的interrupt方法调用的时候 明明当前正在运行的线程是main
        System.err.println( "Stopping application..." );//线程 为什么调用当前没有在运行的thread的interrupt
        //System.exit( 0 );                            //方法 还是可以触发其中的catch语句捕获到异常
    }                                                  //是不是不管调用自身interrupt方法的线程当下是不是
                                                       //在被运行 只要调用了 并且处于阻塞态 就直接catch 并且
    public void run() {                                //执行catch中的相应语句？ 第11行和第12行代码哪个先执行?
        while ( !stop ) 
        {
            System.out.println( "Thread running..." );
            try 
            {
                Thread.sleep( 1000 );                             //上面不是已经false了吗 当调用interrupt方法时不是不会执行下面的语句吗？
            } catch ( InterruptedException e )
            {                                                     //interrupt方法会在线程堵塞时throw一个
                System.out.println( "Thread interrupted..." );    //InterruptedException 前三秒是不是因为还
                 
            }                                                     //没有调用interrupt方法，所以不会catch这个异常？
        }
        System.out.println( "Thread exiting under request..." );
    }
}  
