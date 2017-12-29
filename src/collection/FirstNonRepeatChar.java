package collection;

import java.util.HashMap;
import java.util.Scanner;

public class FirstNonRepeatChar {

	public static void main(String[] args) {

		String str;
		System.out.println("Enter any string");
		Scanner sn = new Scanner(System.in);
		str = sn.nextLine();
		char c = firstNonRepeatchar(str);
		System.out.println("First non repeat character is " + c);
		
		
	}
	public static Character firstNonRepeatchar(String s)
	{
		HashMap<Character,Integer> table = new HashMap<Character,Integer>();
		Character c;
		int length;
		for(int i =0; i<s.length();i++)
		{
			c = s.charAt(i);
			if(table.containsKey(c))
			{
				table.put(c, table.get(c)+1);
			}
			else
			{
				table.put(c, 1);
			}
		}
		for(int i=0;i<s.length();i++)
		{
			c = s.charAt(i);
			if(table.get(c)==1)
			{
				return c;
			}
		}
		return null;
	}

}
