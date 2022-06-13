package p_l6_q3;

public class A {
	
	public int pb=7;
	protected int pro=100;
	int def=3;
	private int pvt=50;
	
	public void PublicMethod() {
		System.out.println("This is Public Method.");
	}
	
	void PackageMethod() {
		System.out.println("This is Package Method.");
	}

	protected void ProtectedMethod() {
		System.out.println("This is Protected Method.");
	}

	private void PrivateMethod() {
		System.out.println("This is Private Method.");
	}
	
	public static void main(String[] args) {
		A ob= new A();
		ob.PublicMethod();
		ob.PackageMethod();
		ob.ProtectedMethod();
		ob.PrivateMethod();
		
		System.out.println(ob.pb);
		System.out.println(ob.pro);
		System.out.println(ob.def);
		System.out.println(ob.pvt);
		
		
	}


}
