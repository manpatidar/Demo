package FileIO;
import java.io.*;

public class Test {

	public static void main(String[] args)throws IOException
	{
		
		/*File f = new File("äbc.txt");
		System.out.println(f.exists());
		
		f.createNewFile();
		System.out.println(f.exists());
		
		File f1 = new File("Manohar");
		System.out.println(f1.exists());
		f1.mkdir();
		System.out.println(f1.exists());
		
		File f2 = new File(f1,"Patidr.txt");
		f2.createNewFile();
		System.out.println(f2.exists());*/
		
		int i=System.in.read();//returns ASCII code of 1st character  
		System.out.println((char)i);//will print the character  
	}
}
