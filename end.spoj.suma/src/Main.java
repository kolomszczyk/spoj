import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Main value = new Main();
		while(scan.hasNextInt()) {
			value.add(scan.nextInt());
			value.print();
		}
		scan.close();		
	}

	
	private int value = 0;
	
	
	public void add(int i) {
		this.value += i;
	}
	
	
	public void print() {
		System.out.println(this.value);
	}
}
