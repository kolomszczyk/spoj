import java.util.*;

public class Alphabet {

	private HashMap <Character, String> alphabet = new HashMap<Character, String>();
	
	private void put(Character c, String s) {
		this.alphabet.put(c, s);
	}
	
	public Alphabet() {
		this.put('A', ".-");
		this.put('B', "-...");
		this.put('C', "-.-.");
		this.put('D', "-..");
		this.put('E', ".");
		this.put('F', ".-..");
		this.put('G', "--.");
		this.put('H', "....");
		this.put('I', "..");
		this.put('J', ".---");
		this.put('K', "-.-");
		this.put('L', "..-.");
		this.put('M', "--");
		this.put('N', "-.");
		this.put('O', "---");
		this.put('P', ".--.");
		this.put('Q', "--.-");
		this.put('R', ".-.");
		this.put('S', "...");
		this.put('T', "-");
		this.put('U', "..-");
		this.put('V', "...-");
		this.put('W', ".--");
		this.put('X', "-..-");
		this.put('Y', "-.--");
		this.put('Z', "--..");
	}
	
	public String toMorse(Character c) {
		return this.alphabet.get(c);
	}
	
	public static void main(String[] args) {
		
		Alphabet alp = new Alphabet();
		Scanner scan = new Scanner(System.in);
		while(scan.hasNextLine()){
			String line = scan.nextLine();
			String out = "";
			for(int i=0; i<line.length(); i++) {
				char c = Character.toUpperCase(line.charAt(i));
				if(c == ' ') {
					out += "/";
					continue;
				}
				out += alp.toMorse(c) + "/";
			}
			System.out.println(out);
		
		}
		scan.close();
		
		
	}

	
	
	
	
	
	/*public static void getAlphabet(){
		// pozostałosc po tworzeniu wczytywania alfabetu 
		Scanner scan = new Scanner(System.in);
		String out ="\n";
		while(scan.hasNextLine()) {
			String[] line = scan.nextLine().split(" ");
			String h = "this." + "put(\'" + line[0] + "\', \"" + line[2] + "\");";
			System.out.println(h);
			out += h + "\n";
		}
		System.out.println(out);
		scan.close();
	}*/
	
}
