/**
 * ���Ը�һ���̵߳��߳������ѭ��������������ѭ������д��catch��䣬���Ե�������ѭ��������ʱ�򣬵����̵߳�
 * interrupt�������᲻�᲻�����ж�ѭ��������ֱ��ִ��catch֮�µ���䡣
 * @author ��������û�Է�
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
 * �����еĽ�����Թ۲쵽����main�̴߳���˯�ߵ�4���ڣ�thread�߳����У������е����κ󣨻���3�룩��threadҲ����
 * ˯�ߣ���������1�������̴߳�������̬����Ϊ�����õ�thread��˯��ʱ��ܳ���1�뵽��main�̼߳������У�����thread
 * ��interrupt����ʱthread��Ϊ����˯�ߣ������������ߵȴ�̬�������Ի��׳��쳣������ִ��catch�������䣬���ң�
 * thread���˳��ȴ���������̬�����»ص�����̬���������ǿɴӿ���̨�������еĽ���۲쵽��ִ��catch�µ����������
 * �Ұ��������֮��thread�ֻص�������̬���Ҳ�����sleep��100000������Ϊ���Ǵ��Լ���ͣ�ĵط�����ִ�У�i���ǻ�ÿ��
 * +1�����ǲ����ٻص�3������if��䲻���ж���
 */
			}
			catch(InterruptedException ev)
			{
				System.out.println("�����Ұ���");
				//break;    //��ط����Լ���һ��break���Կ���
			}
		}
		System.out.println("������һ���ˡ�");
	}	

	public static void main(String[] args) throws Exception {
		Thread thread=new ThreadInterruptTest(true);
		thread.start();
		Thread.sleep(4000);
		thread.interrupt();
		Thread.sleep(3000);
		System.out.println("main�߳����н�����");

	}

}
