package practice;

class INVALIDAGEEXCEPTION extends Exception{
	String s1;
	 INVALIDAGEEXCEPTION(String s) {
		 s1=s;
	}
	 @Override
	   public String toString() { 
	      return ("Output String = "+s1);
	   }
}

public class Exceptions {
	
	private static final String checkAge = null;

	public int m1(int x, int y) {
		return x / y;
	}

	public String m2(String s1) throws NullPointerException{
		return s1.concat("reddy");
	}
	
	public void checkEligibilityToVote(int age) {
		if(age>=18) {
			System.out.println("Eligible for vote");
		}
		else if(age<18) {
			try {
			throw new INVALIDAGEEXCEPTION("Please enter valid age");
			}
			catch(INVALIDAGEEXCEPTION exception) {
				System.out.println(exception);
			}
		}
	}
	
	public static void main(String[] args) {
		Exceptions object = new Exceptions();
		try {
			System.out.println(object.m1(2, 0));
			System.out.println(object.m2(null));
			object.checkEligibilityToVote(16);
		} catch (Exception e) {
			System.out.println(e);
		} finally {
			System.out.println("Try Catch is Completed");
		}
	}
}