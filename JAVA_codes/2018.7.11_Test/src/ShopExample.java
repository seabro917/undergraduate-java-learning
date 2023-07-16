class Shop implements Runnable {
    Thread zhangWorker,wangWorker,boss;
    Shop() {
      boss=new Thread(this);     //这一句我没有看懂 我知道它调用的是通过实现了Runnable接口的线程目标对象
      zhangWorker=new Thread(boss);  //构造了一个线程对象 但是我又有点理不顺为什么要用this辣...
      wangWorker=new Thread(boss);    //5、6行代码里面的boss改成this经过编译也是运行正常的，是不是这三个
      zhangWorker.setName("张工");    //线程共享数据啊？
      wangWorker.setName("王工");
      boss.setName("老板");
    } 
    public void run() {            //↓ 是不是因为每次sleep的线程重新进入就绪态时还是从sleep暂停的地方开始？
       int i=0;     //为什么每次每个线程执行线程体的时候i都为各自的值 为什么各自的值还保留上次运行计算的结果？
       if(Thread.currentThread()==zhangWorker) {       //又：什么情况下三个线程的数值可以共享？
             while(true) {
                  try{  i++;
                      System.out.printf("\n%s已搬运了%d箱苹果\n",zhangWorker.getName(),i);
                      if(i==3)
                           return;    //return是使线程停止吗？ 是指线程进入阻塞态还是线程直接死亡？
					Thread.sleep(10000);      //↑回答上述问题：是指线程直接结束（死亡） 因为我们可以从本
                  }                           //代码中看到当两个工人搬的都到了3个时候对应的两个线程均结束
                  catch(InterruptedException e) {   //所以此时只能执行boss的线程 并且通过判断语句得知两个线程
                        System.out.printf("\n%s让%s继续工作",    //均死亡 所以“老板下班。”
                                        boss.getName(),zhangWorker.getName());
                  }
              }
       }
      else if(Thread.currentThread()==wangWorker) {
              while(true) {
                  try{ i++;
                      System.out.printf("\n%s已搬运了%d箱香蕉\n",wangWorker.getName(),i);
                      if(i==3)
                           return;
                      Thread.sleep(10000);
                      }
                  catch(InterruptedException e) {
                        System.out.printf("\n%s让%s继续工作", 
                                        boss.getName(),wangWorker.getName());
                  }
              }                             //↓存在 但是就算boss线程先抢到资源 因为此时另外两个线程处于就绪态
      }                                    //并不会执行catch之下的语句 所以...            
      else if(Thread.currentThread()==boss) {            //有没有boss线程先抢到cpu资源的可能性？实际运行中
              while(true) {                              //我还没遇到过这样的情况哎...
                   zhangWorker.interrupt();      // 吵醒zhangWorker      //是不是调用interrupt方法过后除了
                   wangWorker.interrupt();      // 吵醒wangWorker        //执行catch之中的语句 同时还会使
                   if(!(wangWorker.isAlive()||zhangWorker.isAlive())) {  //线程退出阻塞状态 回到就绪态？
                        System.out.printf("%n%s下班",boss.getName()); 
                        return;
                   }
          }
      }
    }
}
public class ShopExample {
    public static void main(String args[]) {
        Shop shop=new Shop();
        shop.zhangWorker.start();
        shop.wangWorker.start();
        shop.boss.start();
    }
}
