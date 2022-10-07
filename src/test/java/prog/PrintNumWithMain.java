package prog;

public class PrintNumWithMain {
	static int num = 1;
	public static void main(String[] args) {
			
		if(num<=100) {
			System.out.println(num);
			num = num+1;
			main(null);
		}
		
	}

}
