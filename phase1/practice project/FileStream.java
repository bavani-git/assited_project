package phase1.mphasis;

import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileStream {

	public static void main(String[] args) throws IOException 
	{
		DataInputStream d=new DataInputStream(System.in);
		FileOutputStream fout=new FileOutputStream("C://Users//91701//Desktop//java_training//phaseer.txt",true);
		
		BufferedOutputStream bout=new BufferedOutputStream(fout,1024); 
        System.out.println("Enter text (@ at the end):"); 
        char ch; 
        
        while((ch=(char)d.read())!='@') 
        { 
            bout.write(ch); 
        } 
         
        bout.close(); 
     
        FileInputStream fin= new FileInputStream("C://Users//91701//Desktop//java_training//phaseer.txt"); 
        int cha; 
        while((cha=fin.read())!=-1) 
            System.out.print((char)cha); 
          
        
        fin.close(); 
	}

}
