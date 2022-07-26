package projects;
import java.util.*;    
public class Emailvalid {

	public static void main(String[] args) 
	{
		ArrayList<String> email = new ArrayList<String>();
		String e;
		Scanner s=new Scanner(System.in);
        email.add("javap@domain.co.in");  
        email.add("employe1@domain.com");  
        email.add("firstname.lastname@domain.com");  
        email.add("emaploe2@domain.co.in"); 
		
        System.out.println("enter the mail id:");
        e=s.next();
        e=e.toLowerCase();
        
        if(email.contains(e))
        	System.out.println("true");
        else
        	System.out.println("false");
        
	}

}
