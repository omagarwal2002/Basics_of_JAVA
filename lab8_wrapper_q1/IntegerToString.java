package lab8_wrapper_q1;

public class IntegerToString {
	public static void main(String args[])
	  {
	    int a = 24;
	    int b = -24;
	    int c = 11;
	    String str1 = Integer.toString(a);	//Method-1
	    String str2 = Integer.toString(b);	//Method-1
	    String str3 = String.valueOf(c);	//Method-2
	    String str4 = String.valueOf(13);	//Method-3
	    System.out.println("String str1 = " + str1);
	    System.out.println("String str2 = " + str2);
	    System.out.println("String str3 = " + str3);
	    System.out.println("String str4 = " + str4);
	
	  }
}
