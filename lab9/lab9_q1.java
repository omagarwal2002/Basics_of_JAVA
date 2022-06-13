package lab9;
class ThreadClass extends Thread{
	public void run() {
		try {
			//System.out.println("Thread "+ Thread.currentThread()+" is running.");
			System.out.println("Thread "+ Thread.currentThread().getId()+" is running.");
		}catch(Exception e) {
			System.out.println("Exception is caught");
		}
	}
}

public class lab9_q1 {
	public static void main(String[] args) {
		int n=7;//no. of threads
		for(int i=0; i<n; i++) {
			ThreadClass obj = new ThreadClass();
			obj.start();
		}
	}

}
