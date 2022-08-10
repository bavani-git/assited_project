package projects;

public class Datacasting {

	public static void main(String[] args) 
	{
	float a= 12.345F;
	int val= (int) a;
	System.out.println("int"+val);

	double b=123.34567D;
	long c=(long)b;
	int d= (int)c;
	char e=(char)d;
	System.out.println("char "+e);
	
	long f=1234242345L;
	byte g= (byte)f;
	System.out.println("byte "+g);
	
	int h=123;
	double i=h;
	long j= (long)i;
	System.out.println("long  "+j);

	}

}
