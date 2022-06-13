package Lab2;

import java.util.Scanner;

public class DuplicateArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("give no. of elements in array: ");
		Scanner sc=new Scanner (System.in);
		int n = sc.nextInt();
		System.out.println("give elements of array:");
		    int arr[]= new int[n];
		    for(int i=0;i<n;i++)
		    {
		        arr[i]=sc.nextInt();
		    }
		 System.out.println("......Duplicating the array.......");
		  for(int j=0; j<n; j++) {
			  for(int k=j; k<n; k++) {
				  if(arr[j]==arr[k]) {
					  System.out.print(arr[j]+" ");
				  }
			  }
		  }
		 

	}

}
