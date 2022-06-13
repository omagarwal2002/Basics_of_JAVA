package Lab2;

import java.util.Scanner;

public class BubbleSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("give no. of elements in array: ");
		Scanner sc=new Scanner (System.in);
		int n = sc.nextInt();
		System.out.println("give elements of array:");
		    int arr[]= new int[n];
		    int i,j;
		    //arr.length= n;
		    for(i=0;i<n;i++)
		    {
		        arr[i]=sc.nextInt();
		    }
		    int t;
		    for(i=0;i<n;i++)
		    {
		        for(j=0;j<n-i-1;j++)
		        {
		            if(arr[j]>arr[j+1])
		            {
		                t=arr[j];
		                arr[j]=arr[j+1];
		                arr[j+1]=t;
		            }
		        }
		    }
		    System.out.println("Soreted Array is : ");
		    for(i=0;i<n;i++)
		    {
		        System.out.print(arr[i]+" ");
		    }

	}

}
