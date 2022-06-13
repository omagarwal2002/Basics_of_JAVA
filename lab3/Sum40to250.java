package lab3;

public class Sum40to250 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum=0;
		int i;
		for(i=41; i<250; i++) {
			if(i%5==0) {
				sum += i;
			}
		}
System.out.println("sum is = "+ sum);
	}

}
