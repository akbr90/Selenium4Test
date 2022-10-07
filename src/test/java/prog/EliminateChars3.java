package prog;

public class EliminateChars3 {

	public static void main(String args[]) {
		String str = "hello akbar ali welcome to java programming";
		String newStr = new String();

		for(int i = 0;i<str.length();i++) {
			char ch = str.charAt(i);
			if(newStr.indexOf(ch)<0) {
				newStr=newStr+ch;			
			}

		}
		System.out.println(newStr);
	}

}
