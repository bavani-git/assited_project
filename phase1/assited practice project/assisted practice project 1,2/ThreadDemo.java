package projects;

class exten extends Thread
{	
	public void run()
	{
	System.out.println("Entered text is extend thread");
	}
}
class runna implements Runnable
{	
	public void run()
	{
	System.out.println("Entered theread is an RUNNABLE");
	}
}



public class ThreadDemo
	{
	public static void main(String[] args) 
	{
		exten ob =new exten();
		ob.start();
		
		runna ob1 = new runna();
		Thread ob2= new Thread(ob1);
		ob2.start();
	}

}
