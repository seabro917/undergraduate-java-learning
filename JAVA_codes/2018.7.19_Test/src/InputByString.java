import java.io.IOException;

public class InputByString {

	public static void main(String[] args) throws IOException {
		System.out.print("��������ַ�����ÿ���Իس����з���������������Crtl+Z������");
		byte buffer[]=new byte[512];
		int count=0;                                
		while((count=System.in.read(buffer))!=-1)    //�ǲ��Ǿ�������������Ĺ�����count��ʵ����-1��ֻ�а��»س�
		{                                            //��һ˲�������Ż�ȥ�ж�count��ֵ����һ�λس��ж�һ�Σ�
		    String s=new String(buffer,0,count-2);   //����String�����ֹ��췽�����촮�����Զ��������ֽںϳ�һ��
 	    //  System.err.println(count);               //�����𣿼������ô֪���������úϳɣ��������ֲ��úϳɣ�
        //  System.err.println(s.length());          //�� ʵ�ʼ��������Ǹ���forѭ�����buffer����������ֽڷ���
     	 /*   for(int j=0;j<count;j++)               //������ں��֣�˫�ֽڵ�Unicode�ַ�����������ֽ���������
     	    	System.out.print(buffer[j]+" ");  */  //�Ǹ��������ǲ��������ж������ֽ��ǲ���Ҫ�ϳ�һ���ַ���
 		    for(int i=0;i<s.length();i++)             //�ж����ݣ��ǲ��Ǻ����油��ɶ���йأ�
		    {
			  char ch=s.charAt(i);
			  byte bc=(byte)(ch>>>8);
			  System.out.print(ch+"("+bc+" "+(byte)ch+(bc==0?"":","+(int)ch)+")");
		    }
     		System.out.print("\nInput:"); //��Ȼ����������벻ΪCtrl+Z����ô����whileѭ���ڼ�count��ֵ����Ϊ-1����ô
	    }                                 //���whileѭ��������Ӧ��count���ǲ�Ϊ-1�����whileѭ��������count
		System.in.close();                //��ֵ�����Ƕ��٣�
	}
}
//ֻ�е�����ΪCtrl+Zʱ��System.in.read(buffer)�Ż᷵��-1��
//�Ҿ�������Ĵ�����Ҫһ���ж����ǻس���ҪŪ����س����״�����ʲô��