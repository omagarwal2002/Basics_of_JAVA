package lab6;

import balance_l6_q2.Account;

public class Balance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//balance_l6_q2.Account a= new balance_l6_q2.Account();//fully qualified naming
		Account a = new Account();//by importing the package
		a.read();
		a.Display_Balance();

	}

}
