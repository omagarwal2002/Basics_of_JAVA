package Lab2;

import java.util.Arrays;
import java.util.Scanner;

public class BinarySearch {
	int binarySearch(int arr[],  int n){
		int s,h, mid;
		Arrays.sort(arr);
	    s=0;// smallest
	    h=arr.length -1;// highest 
	    while(s<=h) {
	    	mid=s+(h-s)/2;
	    if(arr[mid]==n)
	    	return mid;
	    if(arr[mid]<n)
	    	s=mid+1;
	    else
	    	h=mid-1;
	    }
	    return -1;   	
	}    
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter length : ");
	    Scanner sc=new Scanner (System.in);
		int l = sc.nextInt();
	    int a[]= new int[l];
	    System.out.println("Enter "+l+ " numbers : ");
	    for(int i=0;i<l;i++)
	    {
	        a[i]=sc.nextInt();
	    }
	    System.out.println("Enter number to be searched : ");
	    int n= sc.nextInt();
		BinarySearch ob= new BinarySearch();
		int x= ob.binarySearch(a, n);
		if(x==-1)
	    System.out.println("Not Found");
	    else {
	    System.out.println("Found and index in sorted array is "+ x);}
	    

	}

}

