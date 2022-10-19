package prog;

import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {


		
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter any Natural number");
		int num = scn.nextInt();
		scn.close();
		
		int a =1, b=1;
		System.out.print(a+" ");
		System.out.print(b+" ");
		int f = 0;
		while(f<=num) {
			
			f = a+b;
			if(f>num)
				break;
			System.out.print(f+" ");
			
			a = b;
			b = f;
		}

	}

}
