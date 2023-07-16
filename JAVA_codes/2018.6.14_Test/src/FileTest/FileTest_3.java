package FileTest;

import java.io.*;
/**
 * 测试数据输入输出流的具体使用
 * @author 海哥昨晚没吃饭
 *心得：注意在java实际的文件读取写入操作中，以int型为例，数据输入输出流实际每次读取或者写入4个字节，在txt文件中
 *实际显示出来的还是将int的四个字节转换成unicode后其对应的字符。
 */


public class FileTest_3 {
	public static void main(String[] asrg) throws IOException
	{
		OutputStream fout=new FileOutputStream("D:\\Studying\\MyEclipse-MyWork\\2018.6.14_Test\\FileTest_1.txt");
		DataOutputStream dout=new DataOutputStream(fout);
		dout.writeInt(13);
		dout.writeInt(14);
		
		InputStream fin=new FileInputStream("D:\\Studying\\MyEclipse-MyWork\\2018.6.14_Test\\FileTest_1.txt");
		DataInputStream din=new DataInputStream(fin);
		while(true)
		{
			try
			{
				int n=din.readInt();
				System.out.println("读取的数字为："+n);
			}
			catch(EOFException ex)
			{
				break;
			}
		}
		
	}
	

}
