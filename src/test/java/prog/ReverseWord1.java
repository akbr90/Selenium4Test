package prog;

public class ReverseWord1 {

	public static void main(String[] args) {
		String str ="emocleW ot avaJ ginmmargorP";
		String [] words =str.split("\\s");
		String newWord="";
		for(int i=0;i<words.length;i++) {
			for(int j = words[i].length()-1; j>=0;j--) {
				newWord = newWord+words[i].charAt(j);
			}
			if(i<words.length-1)
			newWord=newWord+" ";
		}
		System.out.println(newWord);

	}

}
