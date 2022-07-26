package projects;

public class Shape {
	Shape()
	{
		System.out.println("default is printed");
		String s="the value is:";
	}
	Shape(int d)
	{
		int a=d;
		areasqure(a);
	}
	Shape(int l, int b )
	{
		int a=l,c=b;
		arearec(a,c);
	}
	Shape(float l )
	{
		float a=l;
		areacir(a);
	}
	
	void areasqure(int f)
	{
		int are=f*f;
		System.out.println("vlaue of squre"+are);
	}
	void arearec(int f, int l)
	{
		int are=f*l;
		System.out.println("vlaue of rectangle"+are);
	}
	void areacir(float f)
	{
		float are = f*f*3.14F;
		System.out.println("vlaue of circle"+are);
	}

	void arearob(int r,int s)
	{
		int are= r*s/2;
		System.out.println("vlaue of rombus"+are);
	}
	
	void areatri(float b, float h)
	{
		float  are= b*h/2;
		System.out.println( "vlaue of triangle "+are);
	}
	
	public static void main(String[] args) 
	
	{
	Shape s= new Shape();
	Shape s1= new Shape(5);
	Shape s2= new Shape(5,10);
	Shape s3= new Shape(4.5F);
	
	Shape s4= new Shape();
	s4.arearob(10,20);
	s4.areatri(10.0F,20.0F);
	

	}

}
