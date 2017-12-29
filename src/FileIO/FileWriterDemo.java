package FileIO;

import java.io.*;

public class FileWriterDemo {

	public static void main(String[] args) throws IOException
	{
		
		FileWriter fw = new FileWriter("abc.txt",true);
		fw.write(100);
		fw.write("urga/ntechnology");
		char[] ch = {'a','b','c'};
		fw.write('\n');
		fw.write(ch);
		fw.flush();
		fw.close();
	}
}
