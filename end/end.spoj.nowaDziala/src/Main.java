import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int howMany = scan.nextInt();
		for(int i=0; i<howMany; i++) {
			int value = scan.nextInt();
			System.out.println((int)Math.pow(value, 2));
		}
		scan.close();

	}

}
