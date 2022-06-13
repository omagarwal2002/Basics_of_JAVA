package Lab2;
import java.util.Scanner;
public class FibonacciSeries {
	static void Fibonacci(int N)
    {
        int n1 = 0, n2 = 1;
  
        int c = 0;
  
        // Iterate till counter is N
        while (c < N) {
  
            // Print the number
            System.out.print(n1 + " ");
  
            // Swap
            int n3 = n2 + n1;
            n1 = n2;
            n2 = n3;
            c = c + 1;
        }
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n1=0, n2=1, n3, i;
		System.out.println("give number of elements: ");
		Scanner sc=new Scanner (System.in);
		int number = sc.nextInt();
	    Fibonacci(number);
		    }
		
      
	}


