package projPractice;

import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmailId {
public static void main(String[] args) {
		
		ArrayList<String> emails = new ArrayList<String>();  
        emails.add("premkumar@gmail.co.in");  
        emails.add("premkumar@gmail.com");  
        emails.add("premkumar.reddy@gmail.com");  
        emails.add("premkumar#@gmail.co.in");  
        emails.add("premkumar@gmail.com");  
        emails.add("premkumar@gamilcom");  
        
        //Add invalid emails in list  
        emails.add("@yahoo.com");  
        emails.add("premkumar#domain.com");  
        
        //Regular Expression   
        String regex = "^(.+)@(.+)$";  
        
        //Compile regular expression to get the pattern  
        Pattern pattern = Pattern.compile(regex);  
        
        //Iterate emails array list  
        for(String email : emails){     
            Matcher matcher = pattern.matcher(email);  
            System.out.println(email +" : "+ matcher.matches());  
        }  
	}
}