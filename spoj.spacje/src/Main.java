
import java.util.*;

public class Main {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		while(scan.hasNextLine()){
			StringBuilder line = new StringBuilder(scan.nextLine());
			for(int i=0; i<line.length(); i++) {
				if(line.charAt(i) == ' ') {
					char x = line.charAt(i+ 1);
					String y = String.valueOf(x).toUpperCase();
					//char z = y.charAt(0);
					//line.setCharAt(i +1 , z);
					line.replace(i, i+2, y);
				}	
			}
			System.out.println(line.toString());
		}
		scan.close();
	}

}
