package lab3;

import java.util.Scanner;

public class MonthNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the number of the month: ");
		Scanner sc=new Scanner (System.in);
		int n1 = sc.nextInt();
		String[] arr=new String[] {"JANUARY","FEBRUARY","MARCH","APRIL","MAY","JUNE","JULY","AUGUST","SEPTEMBER","OCTOBER","NOVEMBER","DECEMBER"};
		if(n1>=0 && n1<=12) {
			System.out.println("Respective month is : "+ arr[n1 - 1]);
		}
		else {System.out.println("INVALID NUMBER ENTERED");}
		
	}

}
