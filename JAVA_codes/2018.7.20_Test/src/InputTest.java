import java.io.IOException;

public class InputTest {
	public static void main(String args[]) throws IOException
	{
		byte buffer[]=new byte[512];
		int count;
		System.out.print("Please input your string here:");
		count=System.in.read(buffer);
		String s=new String(buffer,0,count-2);
		System.out.println("The String you input is:"+s);   //��֮ǰ��InputByString��ȣ�����while��ѭ����䣬
	}                                                       //��ֻ���ж�һ�ξͳ������н�����

}
