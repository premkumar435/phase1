package practice;

public class ThreadingConcepts {
	
	private static Object obj = new Object();
	
	public static void main(String[] args) throws InterruptedException {
		Thread.sleep(2000);
		System.out.println(Thread.currentThread().getName() + " Thread is invoked after one second");
		synchronized (obj) {
			obj.wait(1000);
			System.out.println(obj + " Object is in waiting state and invoked after 1 seconds");
		}
	}
}