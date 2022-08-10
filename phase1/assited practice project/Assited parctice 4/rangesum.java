package project3;

import java.util.Scanner;

public class rangesum {

	public static void main(String[] args) 
	{
		int []a=new int[10];
		Scanner s = new Scanner(System.in);
		for(int i=0;i<10;i++)
		{
			a[i]=s.nextInt();
		}
		 
		int ra=0,rb=0;
		System.out.println("enter the lower value");
		ra=s.nextInt();
		System.out.println("enter the higher value");
		rb=s.nextInt();
		int sum=0;
		
		for(int i=0;i<10;i++)
		{
			if(a[i]>ra&&a[i]<rb)
				sum=sum+a[i];
			
		}
		
		System.out.println("total sum is" + sum);
		
	
		
	}

}
