package practice2;

class product
{
	int id=78;
	String name="amul";
	void display()
	{
	System.out.println("the id of the product is :"+id);
	System.out.println("the name of the product is :"+name);
	
	}
}
 class a extends product
 {
	 int count=50;
	 String catag="butter";
	 void display()
	 {
		 System.out.println("the id of the product is :"+id);
		 System.out.println("the name of the product is :"+name);
		 System.out.println("the count of the product is :"+count);
		 System.out.println("the catagory of the product is :"+catag);
			 
	 }
 }
 class b extends product
 {
	 int count=90;
	 String catag="MIlk";
	 void display()
	 {
		 System.out.println("the id of the product is :"+id);
		 System.out.println("the name of the product is :"+name);
		 System.out.println("the count of the product is :"+count);
		 System.out.println("the catagory of the product is :"+catag);
			 
	 }
 }
 class c extends product
 {
	 int count=56;
	 String catag="choco";
	 void display()
	 {
		 System.out.println("the id of the product is :"+id);
		 System.out.println("the name of the product is :"+name);
		 System.out.println("the count of the product is :"+count);
		 System.out.println("the catagory of the product is :"+catag);
			 
	 }
 }

class suba extends a
{
	int price=30;
	int total=price*count;

	void display()
	{
		System.out.println("the id of the product is :"+id);
		System.out.println("the name of the product is :"+name);
		System.out.println("the catagory of the product is :"+catag);
		System.out.println("the total is :"+total);
		 
	}

}

class subb extends b
{
	int price=10;
	int total=price*count;

	void display()
	{
		System.out.println("the id of the product is :"+id);
		System.out.println("the name of the product is :"+name);
		System.out.println("the catagory of the product is :"+catag);
		System.out.println("the total is :"+total);
	}

}

public class Iherdemo {
	public static void main(String[] args) 
	{
		a ob1=new a();
		b ob2=new b();
		c ob3=new c();
		
		suba ob4=new suba();
		subb ob5=new subb();
		
		
		ob1.display();
		ob2.display();
		ob3.display();
		ob4.display();
		ob5.display();
		

	}

}
