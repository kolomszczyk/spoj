import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int howMany = scan.nextInt();
		for(int i=0; i<howMany; i++) {
			// --liczbydo  a --podzielność x --niepodzielność y
			int a = scan.nextInt();
			int x = scan.nextInt();
			int y = scan.nextInt();
			for(int j=0; j<a; j++) {
				if(j%x == 0 && j%y != 0) 
					System.out.print(j + " ");
			}
			System.out.println();
			
		}
		scan.close();
	}

}
