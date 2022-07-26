package projects;
import java.util.regex.*;;

public class RegularExpression {

	public static void main(String[] args) 
	{
		System.out.println(Pattern.matches("[a-zA-Z0-9]{6}", "arun32"));
		System.out.println(Pattern.matches("[789]{1}[0-9]{9}", "9953038949"));
		System.out.println(Pattern.matches("[amn]+", "aaa"));
	

	}

}
