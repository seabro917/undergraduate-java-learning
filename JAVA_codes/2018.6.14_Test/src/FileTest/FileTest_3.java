package FileTest;

import java.io.*;
/**
 * ������������������ľ���ʹ��
 * @author ��������û�Է�
 *�ĵã�ע����javaʵ�ʵ��ļ���ȡд������У���int��Ϊ�����������������ʵ��ÿ�ζ�ȡ����д��4���ֽڣ���txt�ļ���
 *ʵ����ʾ�����Ļ��ǽ�int���ĸ��ֽ�ת����unicode�����Ӧ���ַ���
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
				System.out.println("��ȡ������Ϊ��"+n);
			}
			catch(EOFException ex)
			{
				break;
			}
		}
		
	}
	

}
