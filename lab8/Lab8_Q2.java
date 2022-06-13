package lab8;
import java.io.*;
public class Lab8_Q2 {
	static void convertUpper(StringBuffer str)
    {
        int ln = str.length();
 
        for (int i = 0; i < ln; i++) {
            Character c = str.charAt(i);
                str.replace(i, i + 1,
                            Character.toUpperCase(c) + "");
        }
    }
 
    public static void main(String[] args)
    {
        StringBuffer str = new StringBuffer("My name is Om Agarwal and sap. id. is 500087764");
        convertUpper(str);
 
        System.out.println(str);
    }

}
