package practice2;

import java.io.IOException;
import java.util.Scanner;

public class ExceptionCalculate {


static int display(int l,int b) throws IOException
{
	if(l>b)
	{
		throw new IOException(" illigaal input");
	}
	else
		return l*b;
	
}

	public static void main(String[] args) 
	{
		int l,b,r=0;
		Scanner s =new Scanner(System.in);
		System.out.println("enter the length value :" );
		l=s.nextInt();
		System.out.println("enter the breath value :" );
		b=s.nextInt();
		
		try
		{
			r= display(l,b);
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
		finally
		{
			System.out.println(" the result is :"+r);
		}
		
	}

}
