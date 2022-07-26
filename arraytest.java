package projects;

import java.util.Scanner;

public class arraytest {

	public static void main(String[] args) 
	{
		int sum=0;
		int a[]={1,2,3,4,5};
		for(int i:a)
		{
			sum=sum+i;
		}
	System.out.println(sum);
	System.out.println("eh=nter the value");
	
	Scanner s= new Scanner(System.in);
	int b;
	b=s.nextInt();
			
	for(int i:a)
	{
		if(a[i]==b)
		{
			System.out.println("the position is:"+i);
		}
			
	}
	
	
	}

}
