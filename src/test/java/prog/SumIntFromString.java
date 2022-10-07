package prog;

public class SumIntFromString {

	public static void main(String[] args) {
		String str = "849ab1d6-5e2f-4bd5-86d0-5650da2f6b49@$1qw#";
		System.out.println(str.replaceAll("[^0-9]", ""));
		int sum = 0;
		for(int i =0;i<str.length();i++) {
			if(Character.isDigit(str.charAt(i))) {
				sum =sum+Character.getNumericValue(str.charAt(i));}
		}
		System.out.println(sum);

	}

}
