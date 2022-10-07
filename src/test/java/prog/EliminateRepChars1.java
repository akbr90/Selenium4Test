package prog;

import java.util.*;

public class EliminateRepChars1 {

	public static void main(String[] args) {

		String str = "Hello Akbar Ali java";
		str=str.toLowerCase();;
		char[] ch = str.toCharArray();
		int index = 0;
		for(int i=0;i<str.length();i++) {
			int j;
			for(j=0;j<i;j++) {
				if(ch[i]==ch[j]) {
					break;
				}
			}

			if(i==j) {
				ch[index++]=ch[i];
			}
		}
		System.out.println(String.valueOf(Arrays.copyOf(ch, index)));


	}



}
