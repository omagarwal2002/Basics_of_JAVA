package lab4;


class TrunkCall {
	
	String x;
	int y;
	TrunkCall(String n,int time)
	{ x=n; y=time; }
	void show()
	{
	System.out.println("\n--------------------------");
	System.out.println("Call Type: "+x);
	System.out.println("Time used: "+y);
	
	}

}

class Ordinary extends TrunkCall {
	
	int z;
	Ordinary(String name,int min,int r)
	{
	super(name,min);
	z=r;
	
	}
	void show()
	{
	super.show();
	System.out.println("Call Rate: "+z+" Rs/min");
	System.out.println("Total Cost: "+y*z);
	}

}

class Urgent extends TrunkCall {
	
	int z;
	Urgent(String name,int min,int r)
	{
	super(name,min);
	z=r;
	
	}
	void show()
	{
	super.show();
	System.out.println("Call Rate: "+z+" Rs/min");
	System.out.println("Total Cost: "+y*z);
	}

}

class Lightening extends TrunkCall {
	
	int z;
	Lightening(String name,int min,int r)
	{
	super(name,min);
	z=r;
	
	}
	void show()
	{
	super.show();
	System.out.println("Call Rate: "+z+" Rs/min");
	System.out.println("Total Cost: "+y*z);
	}


}


public class L04_q4 {
	public static void main(String args[])
	{
	Lightening l=new Lightening("lightening", 10, 15);
	Urgent u=new Urgent("urgent", 7, 10);
	Ordinary o= new Ordinary("ordinary", 30,5);
	                        //type / time used / rate per min
	l.show();
	u.show();
	o.show();
	}
}
