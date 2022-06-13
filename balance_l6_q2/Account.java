package balance_l6_q2;
import java.util.Scanner;

public class Account {
	
	long acc, bal;
	String name;
	
	public void read() {
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Give the Name: ");
		name= sc.next();
		
		System.out.println("Give the Account No.: ");
		acc= sc.nextLong();
		
		System.out.println("Give the Account Balance: ");
		bal= sc.nextLong();
	}

	public void Display_Balance() {
		// TODO Auto-generated method stub
		System.out.println("------------------------");
		System.out.println("------------Details of Account------------");
		System.out.println("------------------------");
		System.out.println("Name: "+name);
		System.out.println("Account no.: "+acc);
		System.out.println("Balance: "+ bal);

	}

}


