import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int howMany = scan.nextInt();
		for(int i=0; i<howMany; i++) {
			String value = scan.next();
			//int len = value.length() /2;
			for(int j=0; j< value.length() /2 ; j++) {
				System.out.print(value.charAt(j));
			}
			System.out.println();
		}
		scan.close();
	}

}
