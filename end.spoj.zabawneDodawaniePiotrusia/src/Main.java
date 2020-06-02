import java.util.*;

public class Main {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int howMany = scan.nextInt();
		for(int i=0; i<howMany; i++) {
			long value = Integer.valueOf(scan.next());
			int j = 0;
			while(Main.getPalindron(value) != value) {
				value += Main.getPalindron(value);
				j++;
			}
			System.out.println(value + " " + j);
		}
		scan.close();
	}
	
	public static long getPalindron(long num) {
		String strNum = String.valueOf(num);
		String odw = "";	
		for(int i=strNum.length() -1; i>=0; i--) 
			odw += String.valueOf(strNum.charAt(i));
		return Long.valueOf(odw);
	}
	
}
