package project3;

import java.util.Scanner;

public class forthunsorted 
{

	public static void main(String[] args)
	{
		int []a=new int[10];
		Scanner s = new Scanner(System.in);
		for(int i=0;i<10;i++)
		{
			a[i]=s.nextInt();
		}
		 
		int temp;  
		for (int i = 0; i < 10; i++)   
		        {  
		            for (int j = i + 1; j < 10; j++)   
		            {  
		                if (a[i] > a[j])   
		                {  
		                    temp = a[i];  
		                    a[i] = a[j];  
		                    a[j] = temp;  
		                }  
		            }  
		        }  
		       System.out.println(a[3]);  
		
		
	}	
		              
}
