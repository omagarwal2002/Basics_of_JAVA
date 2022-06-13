package lab6;
import java.util.Scanner;//importing pre-defined package
import balance_l6_q2.Account;//importing user defined package
public class lab6_q1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		Account acc = new Account();
		acc.read();
		System.out.println("Give the Name of Bank: ");
		String bnk= sc.next();
		acc.Display_Balance();
		System.out.println("Name of bank: "+ bnk);

	}

}
