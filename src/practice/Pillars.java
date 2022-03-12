package practice;

public class Pillars  extends Parent {
	
		// method overloading
		public int m1(int x,int y) {
			return x+y;
		}
		
		public long m1(long x,long y, long z) {
			return x+y+z;
		}
		
		@Override
		public void m1() {
			System.out.println("hello i am parent class methods.");
		}
		

	public static void main(String[] args) {
		Pillars object = new Pillars();
		object.m1();
		
	}
	

}

class Parent{
	
	public void m1() {
		System.out.println("Hello i am child class method");

	}

}
