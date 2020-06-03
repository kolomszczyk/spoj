import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int howMany = scan.nextInt();
		for(int i=0; i<howMany; i++) {
			long x= scan.nextLong();
			long y= scan.nextLong();
			System.out.println(Main.nwd(x, y));
		}
		scan.close();
	}

	public static long nwd(long x, long y) {
		long a = x;
		long b = y;
		while(a != b) {
			if(a < b) {
				long pom = b;
				b = a;
				a = pom;
			}
			a = a -b;
		}
		return a;
	}
	
	

}
