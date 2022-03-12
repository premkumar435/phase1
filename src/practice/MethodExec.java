package practice;

public class MethodExec {
	
	int val=150;
	
	public int multipynumbers(int a,int b) {
		int z=a*b;
		return z;
	}

	int operation(int val) {
		val =val*10/100;
		return(val);
	}
	
	void area(int b,int h) {
         System.out.println("Area of Triangle : "+(0.5*b*h));
    }
	
    void area(int r) {
         System.out.println("Area of Circle : "+(3.14*r*r));
    }

	public static void main(String[] args) {
		//method demo
		MethodExec b=new MethodExec();
		int ans= b.multipynumbers(10,3);
		System.out.println("Multipilcation is :"+ans);
		System.out.println();
		
		//call by value
		MethodExec d = new MethodExec();
		System.out.println("Before operation value of data is "+d.val);
		d.operation(100);
		System.out.println("After operation value of data is "+d.val);
		System.out.println();
		
		//method overloading
		MethodExec ob = new MethodExec();
		ob.area(10,12);
	    ob.area(5);  
	}
}