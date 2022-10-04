package prog;

public class JustToRun {

	public static void main(String[] args) {
		String price = "Price : $100";
		price = price.replaceAll("[^\\d]","");
		System.out.println(price);
		System.out.println(10+10+"Java");
		System.out.println(10.00+10.00+"Java");
		System.out.println(10.00-10+"Java");
		System.out.println("Java"+10+10);
		System.out.println("Java"+10*10);
	}

}
