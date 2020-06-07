
public class Main {
	
	public static int factorial(int x) {
		int out = x;
		for(int i=2; i<x; i++)
			out = (out * i) % 1000000;
		return out;
	}

	public static void main(String[] args) {
		java.util.Scanner scan = new java.util.Scanner(System.in);
		int howMany = scan.nextInt();
		for(int i=0; i<howMany; i++) {
			int value = scan.nextInt();
			factorial(value);
		}
		scan.close();
		
		System.out.println(factorial(4));
		
		
	}

}
