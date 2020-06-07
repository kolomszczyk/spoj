import java.util.Scanner;

public class Main {
	
	private boolean[] first = new boolean[10001];
	
	public Main() {
		for(int i=0; i<10001; i++)
			first[i] = true;	

		for(int i=2; i< Math.sqrt(10001); i++)  
			if(first[i] == true)
				for(int j=i + i; j<10001; j+=i)
					first[j] = false;	
		first[0] = false;
		first[1] = false;
	}
	
	
	public boolean isFirst(int i) {
		return this.first[i];
	}

	public static void main(String[] args) {
		Main m = new Main();
		Scanner scan = new Scanner(System.in);
		int howMany = scan.nextInt();
		for(int i=0; i<howMany; i++) {
			int x =scan.nextInt();
			if(m.isFirst(x))
				System.out.println("TAK");
			else
				System.out.println("NIE");
		}
		scan.close();
	}
}
