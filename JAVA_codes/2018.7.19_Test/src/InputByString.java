import java.io.IOException;

public class InputByString {

	public static void main(String[] args) throws IOException {
		System.out.print("输入多行字符串，每行以回车换行符结束，输入流以Crtl+Z结束：");
		byte buffer[]=new byte[512];
		int count=0;                                
		while((count=System.in.read(buffer))!=-1)    //是不是就算在我们输入的过程中count其实都是-1，只有按下回车
		{                                            //的一瞬间计算机才会去判断count的值？按一次回车判定一次？
		    String s=new String(buffer,0,count-2);   //关于String用这种构造方法构造串，是自动把两个字节合成一个
 	    //  System.err.println(count);               //汉字吗？计算机怎么知道哪两个该合成，哪两个又不该合成？
        //  System.err.println(s.length());          //↑ 实际加上下面那个用for循环输出buffer数组里面的字节发现
     	 /*   for(int j=0;j<count;j++)               //好像对于汉字（双字节的Unicode字符），存放在字节数组里面
     	    	System.out.print(buffer[j]+" ");  */  //是负数，这是不是用于判断两个字节是不是要合成一个字符的
 		    for(int i=0;i<s.length();i++)             //判定依据？是不是和上面补码啥的有关？
		    {
			  char ch=s.charAt(i);
			  byte bc=(byte)(ch>>>8);
			  System.out.print(ch+"("+bc+" "+(byte)ch+(bc==0?"":","+(int)ch)+")");
		    }
     		System.out.print("\nInput:"); //既然如果我们输入不为Ctrl+Z，那么整个while循环期间count的值都不为-1，那么
	    }                                 //这次while循环结束后不应该count还是不为-1吗？这次while循环结束后count
		System.in.close();                //的值到底是多少？
	}
}
//只有当输入为Ctrl+Z时，System.in.read(buffer)才会返回-1。
//我觉得这类的代码主要一个判定就是回车，要弄清楚回车到底代表了什么。