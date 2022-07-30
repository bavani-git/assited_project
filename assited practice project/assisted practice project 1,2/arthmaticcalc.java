package projects;

import java.util.Scanner;


class clac
{
	public int add(int a,int b)
	{
		return a+b;
	}
	public int sub(int a,int b)
	{
		return a-b;
	}public int mul(int a,int b)
	{
		return a*b;
	}public int div(int a,int b)
	{
		final float x=a/b;
		int y=(int)x;
		return y;
		
	}
}
public class arthmaticcalc {

	public static void main(String[] args) {
		
		clac ob=new clac();
		
		System.out.println("ether the values to calculate");
		int a=0,b=0,result=0,c=0;
		Scanner s= new Scanner(System.in);
		a=s.nextInt();
			
		b=s.nextInt();
		System.out.println("1.....add");
		System.out.println("2.....sub");
		System.out.println("3.....mul");
		System.out.println("4.....div");
		c=s.nextInt();
		if(c==1)
			result=ob.add(a,b);
		if(c==2)
			result=ob.sub(a,b);
		if(c==3)
			result=ob.mul(a,b);
		if(c==4)
			result=ob.div(a,b);
		
		System.out.println("the result is :"+result);
		a=result;
		
		
		
		
	
	
	
	}

}
