package prog;

public class ReverseWord3 {

	public static void main(String[] args) {

		String str ="emocleW ot avaJ ginmmargorP";
		char[] ch=str.toCharArray();
		int left = 0;
		int right = str.length()-1;

		while (left <= right) {
			char temp = ch[right];
			ch[right] = ch[left];
			ch[left] = temp;
			left++;
			right--;
		}

		System.out.println(ch);


	}

}
