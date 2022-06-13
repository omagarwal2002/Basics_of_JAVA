package lab8;
class Lab_8
{
String name;
Lab_8(String n){ name=n; }
void disp()
{
System.out.println("**********************");
System.out.println("Name :"+name);
int c=0;
int len=name.length();
for(int i=0;i<len;i++)
if(name.charAt(i)=='I'||name.charAt(i)=='i')
{
c++;
System.out.println("Number of occurance :"+c);
System.out.println("Position :"+(i+1));
}
if(c==0)
System.out.println("there is no 'O/o' available in the string");
}
}

public class Lab8_Q4 {
	public static void main(String ar[])
	{
	Lab_8 d1=new Lab_8("Nagma Siddiqui");
	d1.disp();
	Lab_8 d2=new Lab_8("OOPS");
	d2.disp();
	}

}
