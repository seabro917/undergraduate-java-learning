package test;

public class Test_02 {

	public static void test_sb() {
		StringBuilder sb = new StringBuilder();
		String str = "abcdffg";
		char chars[] = new char[str.length()];
		chars = str.toCharArray();
		for(int i = 0; i<str.length();i++) {
			sb.append(chars[i]);
		}
	    System.out.println(sb.toString());
	}
	public static void main(String[] args) {
	 test_sb();
	}
}
