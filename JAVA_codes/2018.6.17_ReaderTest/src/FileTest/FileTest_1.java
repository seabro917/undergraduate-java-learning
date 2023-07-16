package FileTest;

import java.io.*;

public class FileTest_1 {
	public static void main(String args[]) throws IOException
	{
		File file1=new File("D:\\Studying\\MyEclipse-MyWork\\2018.6.17_ReaderTest\\File_1.txt");
		FileReader reader=new FileReader(file1);
	    char[] cbuff=new char[(int)file1.length()];
		reader.read(cbuff);
		for(int n=0;n<cbuff.length;n++)
		{
			System.out.print(cbuff[n]+"("+(byte)cbuff[n]+")"+" ");
		}
	}

}
