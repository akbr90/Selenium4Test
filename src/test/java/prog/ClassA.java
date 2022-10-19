package prog;

import java.util.Scanner;

public class ClassA {

	public static void main(String[] args) {


		Scanner scn = new Scanner(System.in);
		
		System.out.print("Enter first number : ");
		
		int  x = scn.nextInt();
		
		System.out.print("Enter Second number : ");
		
		int  y = scn.nextInt();
		scn.close();
		
		System.out.println("Sum of " +x +" and "+y+" is "+(x+y));
		String str = scn.next();
		System.out.println(str);
		boolean flag = scn.hasNext();
		System.out.println(flag);

	}

}
