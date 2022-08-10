package practice2;

import java.util.Scanner;

class SalaryException extends Exception
{
	public SalaryException( String s) {
		super(s);
	}
}
 
public class CustomExcaeption  {

	public static  void Salary(int a) throws SalaryException
	{
		if(a<=20000)
			throw new SalaryException(" less salary");
		
		else
			throw new SalaryException(" salary is good");
		
		
	}
	
	
	public static void main(String[] args) 
	{
	int sa;	
	System.out.println(" plz enter salary:");
	Scanner s= new Scanner(System.in);
	sa= s.nextInt();
	
	
	try
	{
	Salary(sa);
	}
	catch(Exception e)
	{
	System.out.println(e);
	}
    }
	
}	
