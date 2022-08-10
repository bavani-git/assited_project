package phase1.project;

import java.util.Scanner;

public class timing 
{

	row r1= new row();
	row r2= new row();
	row r3= new row();
	row r4= new row();
	row r5= new row();
	
	String name;
	String mail;
	String pno;
	
	Scanner s = new Scanner(System.in);
	void tell()
	{
		int ask1;
		System.out.println("  1. book tickets   ");
		System.out.println("  2. view tickets   ");
		
		ask1=s.nextInt();
		if(ask1==1)
		{
			System.out.println("Enter name:");
			name=s.next();
			System.out.println("Mail id:");
			mail=s.next();
			System.out.println("Mobile number:");
			pno=s.next();
			
			book();
			
		}
		else if(ask1==2)
			show();
		
		else
		{
			System.out.println(" Invalid Option");
		}
	}
	
	
	void book(){
	
	int result, input;
	int c=0;
	char ch;

	try{
	int n;
	do{
	System.out.println("PLEASE ENTER THE ROW NUMBER : 1-5============>");
	n=s.nextInt();
	if(n==1){
	
		System.out.println("ENTER THE SEAT TO BE BOOKED 0-9==========>");
		input= s.nextInt();
		result=r1.seat(input);
		if(result==1)
		{
			System.out.println("seat is booked , have a good show :)");
			c=c+1;
		}
		if(result==-1)
		{
			System.out.println("recquested seat already booked, sorry!!!!!!!");
		}
		
			
		}
	
	
	else if(n==2){
		
			System.out.println("ENTER THE SEAT TO BE BOOKED 0-9==========>");
			input= s.nextInt();
			result=r2.seat(input);
			if(result==1)
			{
				System.out.println("seat is booked , have a good show :)");
				c=c+1;
			}
			if(result==-1)
			{
				System.out.println("recquested seat already booked, sorry!!!!!!!");
			}
			
				
			}
			
	else if(n==3){
		
			System.out.println("ENTER THE SEAT TO BE BOOKED 0-9==========>");
			input= s.nextInt();
			result=r3.seat(input);
			if(result==1)
			{
				System.out.println("seat is booked , have a good show :)");
				c=c+1;
			}
			if(result==-1)
			{
				System.out.println("recquested seat already booked, sorry!!!!!!!");
			}
			
				
			}
		
	else if(n==4){
		
			System.out.println("ENTER THE SEAT TO BE BOOKED 0-9==========>");
			input= s.nextInt();
			result=r4.seat(input);
			if(result==1)
			{
				System.out.println("seat is booked , have a good show :)");
				c=c+1;
			}
			if(result==-1)
			{
				System.out.println("recquested seat already booked, sorry!!!!!!!");
			}
			
				
			}
	else if(n==5){
	
			System.out.println("ENTER THE SEAT TO BE BOOKED 0-9==========>");
			input= s.nextInt();
			result=r5.seat(input);
			if(result==1)
			{
				System.out.println("seat is booked , have a good show :)");
				c=c+1;
			}
			if(result==-1)
			{
				System.out.println("recquested seat already booked, sorry!!!!!!!");
			}
			
			}
	 else{
		System.out.println(" Invalid row Number");
		}

		System.out.println(" ::::::::::DO YOU WANT TO BOOK ANOTHER SEAT:::::::::::: PRESS (Y/y)");
		ch = s.next().charAt(0);
	}
		while(ch=='y'||ch=='Y');
	}
	catch(Exception e)
	{
		System.out.println(" Error ocured "+e);
	}
		System.out.println("           bill                       ");
		System.out.println("--------------------------------------");
		System.out.println("Name                :"+ name);
		System.out.println("Mobile number       :"+ pno);
		System.out.println("Mail id             :"+ mail);
		System.out.println("Total seats booked  :"+ c +"     (cost=150)         ");
		System.out.println("Total paiable amount:"+ c*150);
		System.out.println("--------------------------------------");
		
		
		
	
	}
	
			void show()
	{
		System.out.println("     the seat are    ");
		
		//System.out.println("    ");
		//System.out.println("    ");
		System.out.println("      "+r1.l);
		System.out.println("      "+r2.l);
		System.out.println("      "+r3.l);
		System.out.println("      "+r4.l);
		System.out.println("      "+r5.l);
		System.out.println("                                                       0- Not reserved   ");
		System.out.println("                                                       1- reserved   ");
		
	}
	
	

}
