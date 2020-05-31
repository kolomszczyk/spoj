import java.util.Scanner;

public class Main2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int howMany = scan.nextInt();
		//int howMany = 1;
		for(int i=0; i<howMany +1; i++) {
			String line = scan.next();
			System.out.print(i + " ");
			Main2.convert(line);	
		}
		scan.close();
	}
	
	public static void convert(String line) {
		String l = line;
		String out = "";
		String lastChar = String.valueOf(l.charAt(0));
		int amount = 1;
		for(int i=1; i<line.length(); i++) {
			String c = String.valueOf(line.charAt(i));
			if(c.equals(lastChar)) {
				amount++;
			} else {
				if(amount == 1) {
					out += lastChar;
				}else {
					out += lastChar + String.valueOf(amount);
				}
				lastChar = c;
				amount = 1;
			}
		}
		if(amount == 1) {
			out += lastChar;
		}else {
			out += lastChar + String.valueOf(amount);
		}
		System.out.println(out);
	}

}
