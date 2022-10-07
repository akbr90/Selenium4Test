package prog;

import java.util.*;
import java.util.Scanner;

public class SortIntElements {

	public static void main(String[] args) {
		
		Scanner scn=new Scanner(System.in);
		System.out.print("How many numbers you want in array: ");
		int n = scn.nextInt();
		int [] arr = new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=scn.nextInt();
		}
		scn.close();
		ArrayList<Integer> al = new ArrayList<Integer>();
		for(int i=0;i<arr.length;i++) {
			al.add(arr[i]);
		}
		//Collections.sort(al,Collections.reverseOrder());
		Collections.sort(al);
		for(Integer ele:al) {
			if(ele%2==0) {
				System.out.print(ele+" ");
			}
		}

	}

}
