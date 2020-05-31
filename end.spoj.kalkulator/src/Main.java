import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		while(scan.hasNextLine()) {
			String[] line = scan.nextLine().split(" ");
			switch(line[0]){
				case "+":
					System.out.println(Integer.valueOf(line[1]) + Integer.valueOf(line[2]));
				break;
				case "-":
					System.out.println(Integer.valueOf(line[1]) - Integer.valueOf(line[2]));
				break;
				case "*":
					System.out.println(Integer.valueOf(line[1]) * Integer.valueOf(line[2]));
				break;
				case "/":
					System.out.println(Integer.valueOf(line[1]) / Integer.valueOf(line[2]));
				break;
				case "%":
					System.out.println(Integer.valueOf(line[1]) % Integer.valueOf(line[2]));
				break;
			
			}
			
		}
		scan.close();
		
	}

}
