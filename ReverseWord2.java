package prog;

public class ReverseWord2 {

	public static void main(String[] args) {
		String str ="emocleW ot avaJ ginmmargorP";
		String newString ="";
		String [] words =str.split("\\s");
		for(String word:words) {
			StringBuilder sb= new StringBuilder(word);
			sb.reverse();
			newString=newString+sb.toString()+" ";
		}
		System.out.println(newString);

	}

}
