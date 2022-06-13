package lab4;



class Employee {
	String n;
	int id;
	int pay;
	Employee(String name,int emp_id, int salary)//parameterised constructor
	{ n=name; id=emp_id;pay=salary; }
	void increase_salary(int x) {
		pay = pay+ ((x*pay)/100);
		System.out.println("The increased salary is : "+pay);
	}
	Employee(){}//default constructor
	void show()
	{
	System.out.println("\n--------------------------");
	System.out.println("Name of Employee: "+n);
	System.out.println("Employee id: "+id);
	System.out.println("Salary of Employee: "+pay);
	
	}
	
}

class Manager extends Employee {
	String department="Technical";
	Manager(String name,int emp_id, int salary){
		super(name,emp_id,salary);
	}
		void show() 
		{
			super.show();
			System.out.println("Department: "+ department);
			System.out.println("This is a Manager");
		}

	Manager(){
		super.show();
		System.out.println("This is also a manager");
		System.out.println("Defautlt constructor Created");
		}
}

public class L04_q5 {
	public static void main(String args[])
	{
	Manager m = new Manager("Shyam", 15, 5000);  //parameterised constructor
	                  //name/ emp_id/ salary
	m.show();
	m.increase_salary(50);
	
	Manager m2= new Manager();// default constructor
	}
}
