package practice;

public class StringBufferProg {

	public static void main(String[] args) {

        String str1 = "This is Java Weblog. ";
        
        StringBuffer sb = new StringBuffer();
        sb.append(str1);

        System.out.println("Ex: String to StringBuffer using append() method : \n" + sb);
        
        System.out.println("******************* \n");
        
        StringBuilder sbl = new StringBuilder(str1);
        System.out.println("Ex: String to StringBuilder : \n" + sbl);
	

	}

}
