package FileIO;

import java.io.File;

public class Test1 {

	public static void main(String[] args)
	{
		int count = 0;
		File f = new File("C:\\Drivers");
		String[] s = f.list();
		for(String s1:s)
		{
			count++;
			System.out.println(s1);
				
		}
		System.out.println("Total number of " + count);
		count = 0;
		for(String s1:s)
		{
			File f1 =  new File(f,s1);
			if (f1.isFile())
			{
			count++;
			System.out.println(s1);
			}
				
		}
		System.out.println("Total number of " + count);
	}
}
