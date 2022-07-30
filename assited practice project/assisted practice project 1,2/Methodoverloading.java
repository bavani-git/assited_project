package projects;

public class Methodoverloading {

	public int calculate(int a ,int b)
	{
		int c=0;
		c=a+b;
		return c;
	}
	public int calculate(float d )
	{
		double  e=0;
		e=3.14*(d*d);
		int f=(int)e;
		return f;
	}
	public int calculate(long g ,long h)
	{
		long i=0;
		i=g*h;
		int in=(int)i;
		return in;
	}
	public int calculate(int j)
	{
		return j*j;
	}
	public static void main(String[] args) 
	{
		Methodoverloading m= new Methodoverloading();
		int k=m.calculate(3,4);
		int l=m.calculate(3.0345F);
		int n=m.calculate(3L,4L);
		int o=m.calculate(3);
		
		System.out.println("add :"+k);
		System.out.println("circle :"+l);
		System.out.println("rectangle: "+n);
		System.out.println("squre :"+o);

	}

}
