package String_;


import java.util.*;
import java.util.regex.*;

public class FirstDemo {
	public static void main(String[] args)
	{
	String s1 = "Hello Worldasahelloklhkjhellokjjsdghello;lkjghhello";
	String s2 = "Hello";
	System.out.println("S1 and s2 are equals " + (s1 == s2));
	String s3 = new String("Hello").intern();
	System.out.println("S1 and s3 are equals " + (s1 == s3));
	//String s2 = s1.toUpperCase();
	Pattern Pattern = null;
	Pattern pattern = Pattern.compile("hello");
	Matcher matcher = pattern.matcher(s1);
	
	int occur = 0;
	while(matcher.find())
	{
		occur++;
	}
	
	System.out.println(occur);
	}

	private static void compile(String string) {
		// TODO Auto-generated method stub
		
	}

}
