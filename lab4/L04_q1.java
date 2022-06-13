package lab4;

class Parent {
	public int b;
	private String any;
	protected int account_number= 12324;
	String l;
	Parent(String name,int age)
	{ l=name; b=age;
	this.any= "This is a parent";}
	
	public void show()
	{
	System.out.println("\n--------------------------");
	System.out.println("Name : "+l);
	System.out.println("Age : "+ b);
	
	}
}
class Child extends Parent {

	Child(String name,int age)
	{
	super(name,age);
	}
	public void show() 
	{super.show();
	//System.out.println(super.any);
	}
}

public class L04_q1 {
	public static void main(String args[])
	{
	Parent pt=new Parent("Ram",29);
	Child ch=new Child("Shyam", 19);	
	pt.show();
	System.out.println("bank account: "+ pt.account_number);
	ch.show();
	}

}
