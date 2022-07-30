package practice2;

import java.util.Scanner;

public class ExceptionDemo {

	public static void main(String[] args) 
	{
		int i=0,j=0,k=0;
		Scanner s= new Scanner(System.in);
		System.out.println("Enter the values:");
		i=s.nextInt();
		j=s.nextInt();
		//k=s.nextInt();
		
		try
		{
		k=i/j;	
		}
		
		catch(NullPointerException a)
		{
			System.out.println(" arithmatic exeption occured ..");
			//a.notify();
		}
		 
		catch(Exception e)
		{
			System.out.println(e.getMessage());
			System.out.println("error accored ....");
		}
		
		finally
		{
			System.out.println("finally ...... activated");
			
			System.out.println("plz enter again");
			j=s.nextInt();
			
			k=i/j;
			
			System.out.println(" value is :" +k);
			
		}


	}

}
