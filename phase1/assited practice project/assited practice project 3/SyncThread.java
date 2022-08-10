package practice2;

class sync extends Thread
{
	String k;
	sync(String s)
	{
		k=s;
	}
	public synchronized  void run()
	{
		for(int i=0;i<3;i++)
		{	try{
			Thread.sleep(1000);
			System.out.println(k);
			}
			catch(Exception e)
		{
				
		}
		
		}	
	}
}

public class SyncThread 
{

	public static void main(String[] args) 
	{
		sync s =new sync("manik ");
		sync s1 =new sync("basha");
		
		try
		{
			
			s.start();
			s1.sleep(3000);
			s1.start();
			
			
			
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		
		

	}

}
