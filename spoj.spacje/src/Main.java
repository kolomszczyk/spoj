
import java.util.*;

public class Main {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		String userOut = "";
		while(scan.hasNextLine()){
			String[] line = scan.nextLine().split(" ");
			String out = "";
			try {
			for(int i=0; i<line.length; i++) {
				StringBuilder word = new StringBuilder(line[i]);
				word.setCharAt(0, Character.toUpperCase(word.charAt(0)));
				out += word.toString();
			}
			} catch(Exception e) {
				System.out.println();
				//userOut += "\n";
			}
			
			
			//userOut += out + "\n";
			System.out.println(out);
			
		}
		//System.out.print(userOut);
		scan.close();
	}

}
