package prog;

public class JsonDataPrint {

	public static void main(String[] args) {

		String input = "{01IND02AUS03ENG}";
		String d="";
		String a="";
		System.out.print(input.charAt(0));
		for(int i=1;i<input.length();i++) {

			if(Character.isDigit(input.charAt(i))) {
				d=d+String.valueOf(input.charAt(i));

			}
			else if(Character.isAlphabetic(input.charAt(i))) {
				a=a+String.valueOf(input.charAt(i));
			}
			if(i%5==0) {
				System.out.println("\""+d+"\":"+a+",");

				d="";
				a="";
			}



		}
		System.out.print(input.charAt(input.length()-1));


	}

}
