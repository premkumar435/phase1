package practice;

public class Multithreading implements Runnable{

	public static void main(String[] args) {
		Multithreading object = new Multithreading();
	    Thread threadObject = new Thread(object);
	    threadObject.start();  // without synchronization
	    object.m1(); // with synchronization
	}

	public void run() {
		System.out.println("Greetings for the day..");
        System.out.println("hello..");
        System.out.println("hi..");
	}
	
	 public void m1() {
		    synchronized(this){
		    	for(int i=0;i<10;i++) {
		    		System.out.println(i+1);
		    	}	
		    }
	 }
}