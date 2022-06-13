package lab3;

import java.util.Scanner;

public class DigitsGame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter any 3 non-repeating digits");
		Scanner sc=new Scanner(System.in);
		int n1 = sc.nextInt();
		int n2= sc.nextInt();
		int n3= sc.nextInt();
		if(n1==n2 || n2==n3 || n3==n1) {
			System.out.println("You entered repeing digits plz input them again properly");
			main(args);
		}
		else{
			String x=String.valueOf(n1);  
			String y=String.valueOf(n2); 
			String z=String.valueOf(n3); 
			System.out.println("All possible outcomes are: ");
			System.out.println(x+y+z+" , "+y+z+x+" , "+z+x+y+" , "+z+y+x+" , "+x+z+y+" , "+y+x+z);
		}

	}

}
