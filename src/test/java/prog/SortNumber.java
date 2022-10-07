package newProg;

import java.util.Scanner;

public class SortNumber {    
	public static void main(String[] args) {        

		Scanner scn=new Scanner(System.in);
		System.out.print("How many numbers you want in array: ");
		int n = scn.nextInt();
		int [] arr = new int[n];
		int temp = 0;  
		for(int i=0;i<n;i++) {
			arr[i]=scn.nextInt();
		}
		scn.close();

		//Sort the array in ascending order    
		for (int i = 0; i < arr.length; i++) {     
			for (int j = i+1; j < arr.length; j++) {     
				if(arr[i] > arr[j]) {    
					temp = arr[i];    
					arr[i] = arr[j];
					arr[j] = temp;    
				}     
			}     
		}    

		System.out.println();    

		System.out.println("Elements of array sorted in ascending order: ");    
		for (int i = 0; i < arr.length; i++) {  
			if(arr[i]%2==0) {
				System.out.print(arr[i] + " "); 
			}
		}    
	}    
}    
