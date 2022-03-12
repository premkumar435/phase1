package practice;

public class InnerClassAssisted1 {

	 private String msg="Welcome to Java"; 
	 
	 class Inner{  
	  void hello(){System.out.println(msg+", Let us start learning Inner Classes");}  
	 }  

	public static void main(String[] args) {
		InnerClassAssisted1 obj=new InnerClassAssisted1();
		InnerClassAssisted1.Inner in=obj.new Inner();  
		in.hello();  
	}
}


 class InnerClassAssisted2 {

private String msg="Inner Classes";

 void display(){  
	 class Inner{  
		 void msg(){
			 System.out.println(msg);
		 }  
  }  
  
  Inner l=new Inner();  
  l.msg();  
 }  

 
public static void main(String[] args) {
	InnerClassAssisted2  ob=new InnerClassAssisted2 ();  
	ob.display();  
	}
}


//anonymous inner class
abstract class AnonymousInnerClass {
	   public abstract void display();
	}


	 class InnerClassAssisted3 {

	public static void main(String[] args) {
	AnonymousInnerClass i = new AnonymousInnerClass() {

	         public void display() {
	            System.out.println("Anonymous Inner Class");
	         }
	      };
	      i.display();
		
		

	}

}
