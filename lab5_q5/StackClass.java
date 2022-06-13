package lab5_q5;
import java.util.Scanner;

public class StackClass implements StackInterface  {

	public int pop() {
		System.out.println("This is the pop method of StackClass");
		return 0;
	}
	public void push(int a) {
		System.out.println("This is the push method of StackClass "+ a);
		
	}
	public void display() {
		System.out.println("This is the display method of StackClass");
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StackInterface s= new StackClass();
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the input choice 1-3: ");
		int input = sc.nextInt();
		
		switch(input) {
			case 1:
				s.pop();
				break;
			case 2:
				System.out.println("Give value for a: ");
				int a= sc.nextInt();
				s.push(a);
				break;
			case 3:
				s.display();
				break;
		}
	}

}
