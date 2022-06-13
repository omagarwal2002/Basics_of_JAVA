package lab8;
import java.io.*;
public class Lab8_Q1 {
	public static void main(String[]args) throws Exception
	{
	int len1,len2,last=0;
	DataInputStream in=new DataInputStream(System.in);
	System.out.println("Enter the string:");
	String s1=in.readLine();
	System.out.println("Enter searching string:");
	String s2=in.readLine();
	len1=s1.length();
	len2=s2.length();
	for(int i=0;i<=(len1-len2);i++)
	{
		if(s1.substring(i,len2+i).equals(s2))
	{
	if(last==0)
	System.out.println("first occurance is at possition :"+(i+1));
	last=i+1;
	}
	}
	if(last!=0)
	System.out.println("last occurance is at possition :"+last);
	else
	System.out.println("the string is not found");
	}


}
