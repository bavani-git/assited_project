package practice2;

import Modifier.p1.M;

class mythread extends Thread
{
	 void show()
	{
		for(int i=0;i<4;i++)
		{
			System.out.println(Thread.currentThread().getName()+"  "+i);
			try
			{
			Thread.sleep(3000);
			
			}
			catch(Exception e)
			{
				System.out.println(e);
			}
			//System.out.println(Thread.currentThread().getName()+"  "+i);
		 }
	}
	
	public void run()
	{
		show();
	}
}
public class Threassleep {
	public static void main(String[] args) 
	{
		mythread m1= new mythread();
		m1.setName("java");

		mythread m2= new mythread();
		m2.setName(" learning");
		
		m1.start();
		m2.start();

		
	}

}
