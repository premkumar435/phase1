package practice;

public class ThreadCreation extends Thread{
	
	public void run() {
		for (int i = 0; i <= 10; i++) {
			System.out.println(i);
		}
		System.out.println("run method logic executed");
	}
	
	public static void main(String[] args) {
		ThreadCreation a = new ThreadCreation();
		a.start();
		
		// implements Runnable
		// ThreadCreation threadObject = new ThreadCreation();
		// Thread obj = new Thread(threadObject);
		// obj.start();
	}
}