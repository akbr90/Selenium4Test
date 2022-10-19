package prog;

import java.util.Scanner;

public class ArrayReverse {

	    public static void main(String[] args) 
	    {
	        int n, res,i,j=0;
	        Scanner s = new Scanner(System.in);
	        System.out.print("Enter number of elements in the array:");
	        n = s.nextInt();
	        int array[] = new int[n];
	        int rev[] = new int[n];
	        System.out.println("Enter "+n+" elements ");
	        for( i=0; i < n; i++)
	        {
	            array[i] = s.nextInt();
	        }
	        System.out.println("Reverse of an array is :");
	        for( i=n-1;i>=0 ; i--)
	        {
	            rev[j] = array[i];
	            System.out.print(rev[j]+" ");
	            j++;
	    
	        }
	    }
	}
