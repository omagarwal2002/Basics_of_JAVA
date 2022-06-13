package lab8_wrapper_q1;

public class StringToInteger {
	public static void main(String []args){
	    String str = "500087530";
	    int i = Integer.parseInt(str);
	    System.out.println("Actual String:"+ str);
	    System.out.println("Converted to Int:" + i);
	    System.out.println("Arithmetic Operation on Int: " + (i/3));
	  }
}
