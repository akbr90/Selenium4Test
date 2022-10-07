package prog;

public class NumberWOLoop {

	//one way
	public static void main(String[] args) {
		printNo(1,100);
	}
	public static void printNo(int min, int max) {
		if(min<=max) {
			System.out.println(min);
			printNo(min+1,max);
		}
		

	}

}
