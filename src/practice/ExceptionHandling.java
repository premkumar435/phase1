package practice;

public class ExceptionHandling {
	 String getString(String s) {
			return s.concat("test"); 
	 }
		
	 public static void main(String args[]) {
		 ExceptionHandling object = new ExceptionHandling();
		 try {
			 object.getString(null);
		 } catch (Exception e) {
			 System.out.println(e);
		   } finally {
				System.out.println("Hello i am finally block i will always execute");
			 }
	 }
}
