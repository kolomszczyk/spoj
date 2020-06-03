import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int howMany42 = 0;
		int lastInt = 0;
		while(scan.hasNextLine()) {
			int userIn = scan.nextInt();
			System.out.println(userIn);			
			if(userIn == 42 && lastInt != 42) {
				howMany42++;
			}
			lastInt = userIn;
			if(howMany42>3) {
				break;
			}
		}
		scan.close();
	}

}
