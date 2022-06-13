package lab9;
class RunnableClass implements Runnable{
	public void run() {
		try {
			//System.out.println("Thread "+ Thread.currentThread()+" is running.");
			System.out.println("Thread "+ Thread.currentThread().getId()+" is running.");
		}catch(Exception e) {
			System.out.println("Exception is caught");
		}
	}
}
public class lab9_q1_p2 {
	public static void main(String[] args) {
		int n=9;//no. of threads
		for (int i=0; i<n; i++) {
			Thread obj= new Thread(new RunnableClass());
			obj.start();
		}
	}
}
