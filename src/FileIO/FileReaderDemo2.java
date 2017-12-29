package FileIO;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderDemo2 {

	public static void main(String[] args) throws IOException
	{
		File f = new File("abc.txt");
		FileReader fr= new FileReader(f);
		char[] ch = new char[(int)f.length()];
		for(char ch1:ch)
		{
			System.out.print(ch1);
		}
		fr.close();
		
	}
}
