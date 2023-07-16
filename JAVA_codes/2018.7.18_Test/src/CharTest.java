import java.io.*;

public class CharTest 
{
	

	public static void main(String[] args) throws IOException 
	{
				 FileInputStream fout=new FileInputStream("D:\\Studying\\MyEclipse-MyWork\\2018.7.18_Test\\File_1.txt");
			     InputStreamReader outw=new InputStreamReader(fout);
			     int a=outw.read();
			     System.out.println(outw.getEncoding());
			     System.out.print((char)a);
			     outw.close();
			     fout.close();
			     


	}

}
