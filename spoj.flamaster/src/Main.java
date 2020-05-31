import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		//int howMany = scan.nextInt();
		int howMany = 1;
		for(int i=0; i<howMany; i++) {
			String line = scan.nextLine();
			Main out = new Main(line);
			System.out.println(out);	
		}
	}
	

	
	//private StringBuilder line = new StringBuilder(); 
	private String line = "";
	
	public Main(String line) {
		this.line =  line;
		this.convert();
	}
	
	private void convert() {
		StringBuilder l = line;
		// < in `line` >
		
		
		
		
		
		// <out `line` >
		this.line = l.toString();
	}
	
	public String toString() {
		return this.line.toString();
	}
	
}
