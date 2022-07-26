package projects;

public class StringBufferdemo {

	public static void main(String[] args) 
	{
		
		String s1="started java";
		System.out.println(s1);
		String s2="Hel0o";
		System.out.println(s1.compareTo(s2));
		
		StringBuffer s= new StringBuffer(s1);
		s.append("Phase1");
		System.out.println(s);
		s.delete(2, 5);
		System.out.println(s);
		s.replace(5,9,"python");
		System.out.println(s);
		s.insert(4, " language");
		System.out.println(s);
		s.reverse();
		System.out.println(s);
		System.out.println(s.charAt(9));
		
		System.out.println("converting to string builders");
		
		StringBuilder s4=new StringBuilder(s1);
		s4.append(" i dono ");
		System.out.println(s4);
			System.out.println(s4.charAt(9));
		
		
		
	}

}
