package prog;

import java.util.Scanner;

public class ClassB {
	
	public static void main(String args[]) {
		
		
		Scanner scn =new Scanner(System.in);
		
		System.out.print("Enter any char");
		
		char c =scn.next().charAt(0);
		scn.close();
		
		boolean isVowel=false;
		switch(c) {
		
		case 'a':
		case 'e':
		case 'i':
		case 'o':
		case 'u':
		case 'A':
		case 'E':
		case 'I':
		case 'O':
		case 'U': isVowel = true;
		}
		
		if(isVowel) {
			System.out.println(c+ " is Vowel");
		}
		else {
			System.out.println(c+ " is not Vowel");
		}
		
	}
	
	

}
