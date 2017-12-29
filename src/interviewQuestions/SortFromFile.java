package interviewQuestions;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class SortFromFile {

	public static void main(String[] args) throws IOException{

		FileReader f = new FileReader("DvdInfo.txt");
		BufferedReader br= new BufferedReader(f);
		String line = br.readLine();
	    List<String> ls = new ArrayList<String>();
		while(line != null)
		{
			ls.add(line);
			//System.out.println(line);
			line = br.readLine();
		}
	    br.close();	
	    
		Iterator itr = ls.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
	}

}
