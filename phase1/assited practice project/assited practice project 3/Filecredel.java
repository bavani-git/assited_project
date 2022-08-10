package practice2;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Filecredel {

	public static void main(String[] args) throws IOException 
	{

		String s="hello";
		char []ar= new char[100];
		FileWriter fl =new FileWriter("C://Users//91701//Desktop//java_training//text1.txt");
		fl.write(s);
		fl.close();
		
		FileReader fr= new FileReader("C://Users//91701//Desktop//java_training//text1.txt");
		fr.read(ar);
		System.out.print(" the text entered  "+s);
		fr.close();
		
		File file= new File("C://Users//91701//Desktop//java_training//text1.txt");
		if(file.delete())
		{
			System.out.println("done");
		}
		else
		{
			System.out.println("no");
		}
		


	}

}
