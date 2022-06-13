package lab8_wrapper_q2;

public class StringToFloat {

	    public static float convertStringToFloat(String str)
	    {
	        return Float.parseFloat(str);
	    }
	  
	    public static void main(String[] args)
	    {
	        String stringValue = "731.01";
	  
	        float floatValue;
	  
	        floatValue = convertStringToFloat(stringValue);
	  
	        System.out.println(
	            stringValue + " after converting into float = " + floatValue);
	    }
	}

