package practice;

class Logger {
    void message(){
        System.out.println("This is a message");
    }
}

class Data {
    private String name; // private variable
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
}

class Prot {
    // protected method
    protected void display() {
        System.out.println("From Animal class");
    }
}

public class AccessModifiers extends Prot{
	public static void main(String[] args) {
		
		// Private Access Modifier
        Data d = new Data(); // create an object of Data
        d.setName("Prem");
        System.out.println(d.getName());
        
        // Protected Access Modifier
        AccessModifiers dog = new AccessModifiers(); // create an object of Dog class
        dog.display(); // access protected method
        
        // Public Access Modifier
        Animal animal = new Animal();
        animal.legCount = 4; // accessing the public variable
        animal.display(); // accessing the public method
	}
}
