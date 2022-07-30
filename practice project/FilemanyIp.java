package phase1.mphasis;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.*;


public class FilemanyIp {

	public static void main(String[] args) throws IOException
	{
	
	DataInputStream f = new DataInputStream(System.in);
		
	FileOutputStream fout = new FileOutputStream("C://Users//91701//Desktop//java_training//phase-1.txt",true);
	
	BufferedOutputStream bout =new  BufferedOutputStream(fout,1024);

	System.out.println("Enter text (@ at the end):"); 
    char ch; 
    
    while((ch=(char)f.read())!='@')
    {
    	bout.write(ch);
    }
    
    fout.close();
    
    
    FileInputStream fin = new FileInputStream("C://Users//91701//Desktop//java_training//phase-1.txt");
    int cha;
    while((cha=fin.read())!=-1)
    {
    	System.out.print((char)cha);
    }
    
    fin.close();
    
	}

}
