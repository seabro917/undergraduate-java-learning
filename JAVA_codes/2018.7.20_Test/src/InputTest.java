import java.io.IOException;

public class InputTest {
	public static void main(String args[]) throws IOException
	{
		byte buffer[]=new byte[512];
		int count;
		System.out.print("Please input your string here:");
		count=System.in.read(buffer);
		String s=new String(buffer,0,count-2);
		System.out.println("The String you input is:"+s);   //和之前的InputByString相比，少了while的循环语句，
	}                                                       //则只会判定一次就程序运行结束。

}
