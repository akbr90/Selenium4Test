package prog;

import java.util.HashSet;

public class EliminateChars2 {

	public static void main(String[] args) {

		String str = "Hello AKbar Ali welcome to java";
		str = str.toLowerCase();
	
		HashSet<Character> hs = new HashSet<>();
		for(int i =0;i<str.length();i++) {
			hs.add(str.charAt(i));
		}
		for(Character ch: hs) {
			System.out.print(ch);
		}
		

	}

}
