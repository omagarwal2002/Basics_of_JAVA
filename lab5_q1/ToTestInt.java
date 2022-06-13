package lab5_q1;

public class ToTestInt {
	public static void main(String[] args) {
		int z = 0;
		System.out.println("calling from ToTestInt class main method");
		test t = new Arithmetic();

		z = t. square(10);
		System.out.println("The value of square =" + z);

	}

}
