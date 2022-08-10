package practice2;

interface aaaa
{
	public static void advice() 
	{
		System.out.println("a.............................. is here");
	}
}
interface bbbb
{
	public static void advice()
	{
		System.out.println("b...............................is here");
	}
}
public class Diamond implements aaaa,bbbb
{
	public static void main(String[] args) 
	{
		Diamond d = new Diamond();
		d.advice();
		
	}

	public void advice() {
		
		aaaa.advice();
		bbbb.advice();
	}
	
}
