package FileTest;

import java.io.*;

/**
 * 测试java的文件输入输出流，观察其每次读取写入的仅为一个字节的特点，同时熟悉相关数据类型的转换，并且在控制台使用
 * 数据类型强制转换观察不同情况下由文件输入流得到的不同结果。
 * @author 海哥昨晚没吃饭
 *
 *心得：第一次我通过文件输出流往文件里面写入值为36的int，我们知道一个int数据类型为4个字节，而文件输出流一次只能
 *写入一个字节，且在文件中显示出来的都为我们传的数据的字节所对应的unicode编码的字符，所以36对应的字符是$，打开
 *文件发现显示的也是$。
 *     第二次为了更进一步理解“每次只写入一个字节”的意义，因为两个字节（00000000 00000000）共16位，若我们加入第17位，
 *即：2^16，用36+2^16=65572，这时，int第三个字节的空间就不是全为0了，（00000000 00000001 00000000 0x24），但是
 *文件输出流每次只往文件里面写一个字节，所以就算我们将36改成65572，写入的也只有0x24，所以在文件中我们还是只能看到
 *一个$符号。同样，文件输入流每次只能读取文件中的一个字节，$所对应的字节0x24，我们用标准输入输出流将结果显示到控制台
 *时候，也就只能看到36，而非65572。     
 */     

public class FileTest_4 {
	public static void main(String[] args) throws IOException
	{
		OutputStream fout=new FileOutputStream("D:\\Studying\\MyEclipse-MyWork\\2018.6.14_Test\\FileTest_1.txt");
		InputStream fin=new FileInputStream("D:\\Studying\\MyEclipse-MyWork\\2018.6.14_Test\\FileTest_1.txt");
		fout.write(65572);
		int n=0;
		while((n=fin.read())!=-1)
		{
			System.out.print(n);
		}
		
		fin.close();
		fout.close();
		
	}
	

}
