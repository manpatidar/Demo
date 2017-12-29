package FileIO;
import java.io.*;
import java.io.BufferedReader;

public class BufferedReaderDemo {
	
	public static void main(String[] args) throws IOException
	{
		FileReader fr = new FileReader("abc.txt");
		BufferedReader br = new BufferedReader(fr);
		String line = br.readLine();
		while(line != null)
		{
			System.out.println(line);
			line = br.readLine();
		}
	    br.close();	
	}

}
