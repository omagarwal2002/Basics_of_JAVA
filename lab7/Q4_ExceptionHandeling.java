package lab7;
import java. util.*;
public class Q4_ExceptionHandeling {
	public static void main (String [] args) {

		Scanner sc = new Scanner (System. in) ;
		try{
			try{
				System. out . println("Enter First Number");
				int x = new Integer (sc. nextInt());
				System. out . println("Enter Second Number") ;
				int y = new Integer (sc. nextInt () );
				System . out . println("\n"+(x/y));
			}catch (InputMismatchException e){
				System. out. println("java.util.InputMismatchException");
			}

		}catch (Exception e){
			System . out. println(e) ;
		}
	}
}