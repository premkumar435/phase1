package practice;

class SumReturn  
{  
    private int a;  
    public SumReturn(int i) {  
        a = i;  
    }  
    /*The addition method returns a SumReturn object with adding 100 into it. */  
    public SumReturn addition() {  
        SumReturn result = new SumReturn(a + 100);  
        return result;  
    }  
    public void display()  
    {  
        System.out.println("Additon result: " + a);  
    }  
}  

public class DiffReturnTypes {
	
	 public int CompareNum() {   
		 int x = 21;  
	     int y = 18;  
	     System.out.println("x = " + x + "\ny = " + y);  
	     if(x>y)  
	    	 return x;  
	     else  
	         return y;  
	}  
	 
	public static void main(String[] args) {
		// Returning a Value from a Method
		DiffReturnTypes obj = new DiffReturnTypes();
		int result = obj.CompareNum();  
	    System.out.println("The greater number among x and y is: " + result);
	     
	    // Returning a Class
	    SumReturn obj1 = new SumReturn(33);  
	    SumReturn obj2;
	    obj2 = obj1.addition(); // addition method returns a reference of SumReult class 
	    obj2.display();  
	}
}