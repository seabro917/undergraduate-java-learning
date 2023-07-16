
public class StringTest {

	public static void main(String[] args) {
		byte buffer[]={-12,-84,-12,-13};
		String s=new String(buffer,0,buffer.length);
		System.out.println(s);

	}

}
