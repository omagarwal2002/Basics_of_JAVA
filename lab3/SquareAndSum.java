package lab3;

import java.util.Scanner;

public class SquareAndSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.println("give elements of array:");
		int x=0;
		    int arr[]= new int[10];
		    int arr2[]= new int[10];
		    for(int i=0;i<10;i++)
		    {
		        arr[i]= sc.nextInt();
		    }
		    for(int i=0;i<10;i++)
		    {
		        arr2[i]= arr[i]*arr[i];
		    }
		    for(int i=0;i<10;i++)
		    {
		        x+=arr2[i];
		    }
		    System.out.println("The sqauares of all inputs: ");
		    for(int i=0;i<10;i++)
		    {
		        System.out.print(arr2[i]+" ");
		    }
		    System.out.println("");
		    System.out.println("The sum of sqauers of all inputs = "+ x);
	}

}
