package phase1.project;


import java.util.Scanner;


public class Main extends complete {
	
	public static void main(String args[])
	{
		
		Scanner s= new Scanner (System.in);
		
		
		System.out.println("*******************************************************");
		System.out.println("********  	 Welcome to GRAND CINIMA      *********");
		System.out.println("*******************************************************");
		
	
		
		String userid="user1",u;
		String password="1111",p;
		String np ;
		int pass;
		System.out.println("1.  login to Front Desk");
		System.out.println("2.  change password of Front Desk");
		pass=s.nextInt();
		if(pass==2)
		{
			System.out.println("Enter the old password");
			np=s.next();
			if(np.equals(password))
			{
				System.out.println("Enter new password");
				password=s.next();
			}
			else
			{
				System.out.println(" password did not match...exiting code.");
				System.exit(0);
			}
		}
		System.out.println("Enter user id");
		u=s.next();
		System.out.println("Enter password");
		p=s.next();
		
		
		char ch;
		int day;
		complete con= new complete();
		
		if(u.equals(userid)   &&   p.equals(password))
		{
			con.call();
		}
	
	}
}
