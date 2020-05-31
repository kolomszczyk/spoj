import java.util.*;

public class Main {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int howMany = Integer.valueOf(scan.nextLine());
		//int howMany = 1;
		for(int i=0; i<howMany; i++) {
			
			Main line = new Main(scan.nextLine());
			int out =   line.get(0) *1 +
					line.get(1) *3 +
					line.get(2)	*7 +
					line.get(3)	*9 +
					line.get(4) *1 +
					line.get(5)	*3 +
					line.get(6) *7 +
					line.get(7)	*9 +
					line.get(8) *1 +
					line.get(9) *3 +
					line.get(10) *1;
			//System.out.println(out);
				
			if( (out % 10) == 0) {
				System.out.println("D");
			} else {
				System.out.println("N");
			}
			
			
			
			
		}
		scan.close();
		
		
		
	}
	
	String value = "";
	
	public Main(String s) {
		this.value = s;
	}
	
	public int get(int i) {
		return Integer.valueOf(String.valueOf(this.value.charAt(i)));
		
	}
	
}
