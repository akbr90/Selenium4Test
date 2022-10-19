package prog;

public class TestClass{


	static int x=5;


	public static void main(String args[]){
		System.out.println(x);
		String str = "849ab1d6-5e2f-4bd5-86d0-5650da2f6b49@$1qw#";
		String digit = "";

		for(int i=0;i<str.length();i++) {

			if(Character.isDigit(str.charAt(i))) {
				digit=digit+str.charAt(i);


			}
		}
		System.out.println(digit);
		System.out.println(str.replaceAll("[^\\d]",""));
	}
}
