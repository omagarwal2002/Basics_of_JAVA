package lab8_wrapper_q2;

import java.util.*;
public class FloatToStringExample {
	
	    public static String
	    convertFloatToString(float floatValue)
	    {
	        return Float.toString(floatValue);
	    }
	    public static void main(String[] args)
	    {
	        float floatValue = 56;
	        String stringValue;
	        stringValue = convertFloatToString(floatValue);
	        System.out.println(floatValue + " after converting into string = " + stringValue);
	    }
}
