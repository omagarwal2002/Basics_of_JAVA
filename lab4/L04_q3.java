package lab4;

class Worker {
	String name;
	int empno;
	Worker(int no,String n)
	{ empno=no; name=n; }
	void compay()
	{
	System.out.println("\n--------------------------");
	System.out.println("Employee number : "+empno);
	System.out.println("Employee name : "+name);
	}
	void type() {System.out.println("This is a worker");}

}

class dailyworker extends Worker {
	int rate;
	dailyworker(int no,String name,int r)
	{
	super(no,name);
	rate=r;
	}
	void compay(int h)
	{
	super.compay();
	System.out.println("Salary : "+rate*h);
	System.out.println("This is a daily worker");
	}
}

class salariedworker extends Worker {
	int rate;
	salariedworker(int no,String name,int r)
	{
	super(no,name);
	rate=r;
	}
	void compay(int h)
	{
	h=40;
	super.compay();
	System.out.println("Salary : "+ rate*h);
	System.out.println("This is a salaried worker");
	}

}


public class L04_q3 {
	public static void main(String args[])
	{
	dailyworker d=new dailyworker(25,"Shyam",75);
	                            //worker_no, name, rate_per_hour
	salariedworker s=new salariedworker(24,"Pawan",100);
	                            //worker_no, name, rate_per_hour
	d.compay(45);
	s.compay(43);

	}
}
