class Shop implements Runnable {
    Thread zhangWorker,wangWorker,boss;
    Shop() {
      boss=new Thread(this);     //��һ����û�п��� ��֪�������õ���ͨ��ʵ����Runnable�ӿڵ��߳�Ŀ�����
      zhangWorker=new Thread(boss);  //������һ���̶߳��� ���������е���˳ΪʲôҪ��this��...
      wangWorker=new Thread(boss);    //5��6�д��������boss�ĳ�this��������Ҳ�����������ģ��ǲ���������
      zhangWorker.setName("�Ź�");    //�̹߳������ݰ���
      wangWorker.setName("����");
      boss.setName("�ϰ�");
    } 
    public void run() {            //�� �ǲ�����Ϊÿ��sleep���߳����½������̬ʱ���Ǵ�sleep��ͣ�ĵط���ʼ��
       int i=0;     //Ϊʲôÿ��ÿ���߳�ִ���߳����ʱ��i��Ϊ���Ե�ֵ Ϊʲô���Ե�ֵ�������ϴ����м���Ľ����
       if(Thread.currentThread()==zhangWorker) {       //�֣�ʲô����������̵߳���ֵ���Թ���
             while(true) {
                  try{  i++;
                      System.out.printf("\n%s�Ѱ�����%d��ƻ��\n",zhangWorker.getName(),i);
                      if(i==3)
                           return;    //return��ʹ�߳�ֹͣ�� ��ָ�߳̽�������̬�����߳�ֱ��������
					Thread.sleep(10000);      //���ش��������⣺��ָ�߳�ֱ�ӽ����������� ��Ϊ���ǿ��Դӱ�
                  }                           //�����п������������˰�Ķ�����3��ʱ���Ӧ�������߳̾�����
                  catch(InterruptedException e) {   //���Դ�ʱֻ��ִ��boss���߳� ����ͨ���ж�����֪�����߳�
                        System.out.printf("\n%s��%s��������",    //������ ���ԡ��ϰ��°ࡣ��
                                        boss.getName(),zhangWorker.getName());
                  }
              }
       }
      else if(Thread.currentThread()==wangWorker) {
              while(true) {
                  try{ i++;
                      System.out.printf("\n%s�Ѱ�����%d���㽶\n",wangWorker.getName(),i);
                      if(i==3)
                           return;
                      Thread.sleep(10000);
                      }
                  catch(InterruptedException e) {
                        System.out.printf("\n%s��%s��������", 
                                        boss.getName(),wangWorker.getName());
                  }
              }                             //������ ���Ǿ���boss�߳���������Դ ��Ϊ��ʱ���������̴߳��ھ���̬
      }                                    //������ִ��catch֮�µ���� ����...            
      else if(Thread.currentThread()==boss) {            //��û��boss�߳�������cpu��Դ�Ŀ����ԣ�ʵ��������
              while(true) {                              //�һ�û�����������������...
                   zhangWorker.interrupt();      // ����zhangWorker      //�ǲ��ǵ���interrupt�����������
                   wangWorker.interrupt();      // ����wangWorker        //ִ��catch֮�е���� ͬʱ����ʹ
                   if(!(wangWorker.isAlive()||zhangWorker.isAlive())) {  //�߳��˳�����״̬ �ص�����̬��
                        System.out.printf("%n%s�°�",boss.getName()); 
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
