import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		//int howMany = scan.nextInt();
		int howMany = 1;
		for(int i=0; i<howMany; i++) {
			int x = scan.nextInt();
			for(int k=0; k<x; k++) {
				ArrayList<Integer> even = new ArrayList<Integer>();
				ArrayList<Integer> uneven = new ArrayList<Integer>();
				for(int  j=0; j<k; j++) {
					int num = scan.nextInt();
					System.out.println(num);
					if(num % 2 == 0)
						even.add(num);
					else
						uneven.add(num);
				}
					
				/*for(int j=0; j<even.size(); j++) {
					System.out.print(even.get(j) + " ");
				}
				for(int j=0; j<uneven.size(); j++) {
					System.out.print(uneven.get(j) + " ");
				}
				*/System.out.println();
			}	
		}
		scan.close();
	}
}
