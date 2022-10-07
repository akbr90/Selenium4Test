package prog;

public class CharReplace {

	public static void main(String args []) {
		String str="tomorrow";
		String s = "\\$";
		while(str.indexOf('o')!=-1) {
			str = str.replaceFirst("o", s);
			s = s+"\\$";
		}
		
		System.out.println(str);

	}


}
