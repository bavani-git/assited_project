package phase1.project;

import java.util.Scanner;

public class dates 
{

	timing t1= new timing();
	timing t2= new timing();
	timing t3= new timing();
	void date()
	{
		Scanner s= new Scanner (System.in);
		
		
		
		char ch;
		
		
		System.out.println("-----------------  THE LEGAND-----------------------");	
		System.out.println("enter the timing:");
		System.out.println("              9.00 am  show");
		System.out.println("              1.00 pm show");
		System.out.println("              5.00pm show");
		int tn;
		tn= s.nextInt();
		if(tn==9)
		{
			
			t1.tell();
		}
		
		else if(tn==1){
			
			t2.tell();
		
			}
		
		else if(tn==5){
			
			t3.tell();
			
			}
		else{
			System.out.println("invalid  Timing");
		}
		
		
		
	}
}
