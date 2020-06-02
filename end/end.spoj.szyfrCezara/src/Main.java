import java.util.*;
import java.lang.*;

class Main
{

	public static char coding(char userC) {
		char userChar = userC;
		if(userChar == '\n' || userChar == ' ')
			return userChar;
		userChar += 3;
		if(userChar > 90)
			userChar -= 26;
		return userChar;
	}
	
	public static String coding(String userS) {
		String out = "";
		for(int i=0; i<userS.length(); i++) {
			out += String.valueOf(Main.coding(userS.charAt(i)));
		}
		return out;
	}
	
	public static char deconding(char userC) {
		char userChar = userC;
		if(userChar == '\n' || userChar == ' ')
			return userChar;
		userChar -= 3;
		if(userChar < 65)
			userChar += 26;
		return userChar;
	}

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		while(scan.hasNextLine()) {
			String line = scan.nextLine();
			System.out.println(Main.coding(line));
			
		}
		/*
		
		String userIn ="";
		while(scan.has()) {
			userIn += scan.nextLine() + "\n";
			
		}
		try {
		userIn += scan.nextLine();
		} catch (Exception e) {
			// pass
		}
		String out = "";
		for(int i=0; i<userIn.length(); i++) {
			out += Main.coding(userIn.charAt(i));
		}
		System.out.print(out);
		scan.close();
		*/
	}
}