package projects;

import java.util.*; 

public class CollectionDemo {

	public static void main(String[] args) 
	{
		System.out.println("ArrayList");
		ArrayList<String> city=new ArrayList<String>();   
	      city.add("India");//
	      city.add("ladak");    	   
	      System.out.println(city);  
		
	      System.out.println("Vector");
	      Vector<Integer> vec = new Vector();
	      vec.addElement(1); 
	      vec.addElement(2); 
	      System.out.println(vec);
	}

}
