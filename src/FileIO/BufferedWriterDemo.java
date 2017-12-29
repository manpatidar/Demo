package FileIO;

import java.io.*;

public class BufferedWriterDemo {

	public static void main(String[] args) throws IOException
	{
		
		FileWriter fw = new FileWriter("abc.txt");
		BufferedWriter bw = new BufferedWriter(fw);
		bw.write(100);
		bw.newLine();
		char[] ch = {'m','a','n'};
		bw.write(ch);
		bw.newLine();
		bw.write("Patidar");
		bw.flush();
		bw.close();
	}
}
