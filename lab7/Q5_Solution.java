package lab7;
import java . util. Scanner ;

class Calc {
	public static int power (int a, int b) throws Exception {
		if(a<0 || b<0){
			throw new Exception ("a or b should not be negative.") ;
		}
		else if(a==0 && b==0) {
				throw new Exception ("a and b should not be zero. ");
		}
		else {return ((int) Math.pow(a, b) );
		}
	}
}

public class Q5_Solution {
	
	public static final Calc calculator = new Calc() ;
	public static final Scanner in = new Scanner (System. in) ;
	public static void main (String[] args) {
	while (in . hasNextInt()) {
		int a = in .nextInt();
		int b = in .nextInt() ;
		try {System. out . println(calculator.power(a, b)) ;
		}
		catch (Exception e) {System.out .println(e);}
		}
	}
}
