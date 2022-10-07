package prog;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class SortCharELements {
	public static void main(String[] args) {

		Scanner scn=new Scanner(System.in);
		System.out.print("How many characters you want in array: ");
		int n = scn.nextInt();
		char [] arr = new char[n];
		for(int i=0;i<n;i++) {
			arr[i]=scn.next().charAt(0);
		}
		scn.close();
		ArrayList<Character> al = new ArrayList<Character>();
		for(int i=0;i<arr.length;i++) {
			al.add(arr[i]);
		}
		Collections.sort(al,Collections.reverseOrder());
		//Collections.sort(al);
		for(Character ele:al) {
			System.out.print(ele+" ");
		}

	}

}
