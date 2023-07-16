package Day_2;

public class Hanoi {

	public static void main(String[] args) {
		char A = 'A';
		char B = 'B';
		char C = 'C';
		
		hanoi(3, A, B, C);

		
	}
	public static void hanoi(int n, char A, char B, char C){
		if(n == 1) {
			System.out.println("Move first one from " + A + " to "+C);
		}else {
			hanoi(n-1, A, C, B);
			System.out.println("Move the " + n + "th one from " + A + " to " + C);
			hanoi(n-1, B, A, C);
		}
	}
}
