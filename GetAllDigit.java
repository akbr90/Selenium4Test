package prog;

public class GetAllDigit {

	public static void main(String[] args) {
		String str = "849ab1d6-5e2f-4bd5-86d0-5650da2f6b49@$1qw#";

		int len= str.length();
		for(int i= 0 ; i< len ;i++){ 
			if (str.charAt(i) >= '0'
					&& str.charAt(i) <= '9'){


				System.out.print(str.charAt(i));

			}
		}

	}

}
