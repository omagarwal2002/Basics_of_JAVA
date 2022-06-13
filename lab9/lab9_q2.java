package lab9;
class Even extends Thread{
	Thread t = null;
	
	Even(){
		t= new Thread(this);
		start();
	}
	
	public void run() {
		try {
			for (int i=2; i<50; i+=2)
				System.out.print("Thread "+ Thread.currentThread()+"	"+i+" \n");
			Thread.sleep(1000);
		}catch(Exception e) {
			System.out.println("thread interepted");
		}
	}
}
class Odd extends Thread{
	Thread t = null;
	
	Odd(){
		t= new Thread(this);
		start();
	}
	
	public void run() {
		try {
			for (int i=1; i<50; i+=2)
				System.out.print("Thread "+ Thread.currentThread()+"	"+i+" \n");
			Thread.sleep(50);
		}catch(Exception e) {
			System.out.println("thread interepted");
		}
	}
}
public class lab9_q2 {
	public static void main(String[] args) {
		Even e = new Even();
		Odd o= new Odd();
	}

}
