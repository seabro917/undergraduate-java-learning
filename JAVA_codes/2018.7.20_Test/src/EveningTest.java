import java.io.IOException;

public class EveningTest {
	public static void main(String args[]) throws IOException
	{
		int i;
		while ((i=System.in.read())!=-1) 
		System.out.print((char)i+"("+i+")");
	}

}
