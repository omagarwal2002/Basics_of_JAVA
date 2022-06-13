package lab5_q4;

public class Student implements maths {
	int s=0;
	int t=0;
	String x;
	public void name(String b) {
		 x= b;
	}
	public int division(int b, int c) {
		s=b/c;
		return s;}
			
	public int modules(int b, int c) {
		t=b%c;
		return s;}
			
	public void display() {
		System.out.println("Name: "+ x);
		System.out.println("Division: "+s);
		System.out.println("Modulus: "+t);
		}

}
