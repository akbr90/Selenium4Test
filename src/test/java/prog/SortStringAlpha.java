package prog;

import java.util.Arrays;

public class SortStringAlpha {

	public static void main(String[] args) {

		String str = "Akbar Ali";
		String sortString = new String(str);
		char charArray[] = str.toCharArray();
		Arrays.sort(charArray);
		System.out.println(new String(charArray));
		System.out.println();

	}

}
