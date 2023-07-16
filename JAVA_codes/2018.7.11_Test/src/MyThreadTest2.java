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
		} catch (InterruptedException e) {            //main�߳�˯����3��Ŀ�ʼ r1�߳̿�ʼ���� ���������ȿ�
			e.printStackTrace();                      //try�����˯��5���� ������������Ȼmain�̱߳�����
		}                                             //r1�߳�Ҳû�п�ʼ���� ����main�߳̽���֮���ٵ�2��
        for (int i = 0; i < 3; i++) {                 //r1֮ǰ˯�ߵ�5����� r1�������̬ ����r1��run����
        	System.out.println("Runner1 : " + i);     //ʱ�����Ǵ�try��ʼ����������Ӧ����Զr1����˯����
        }
	}	                                              //�����ش�sleep���������൱�����߳̽�����������
}                                                     //�ȴ�̬ ��״̬�������̴߳���ͣ���������С�
