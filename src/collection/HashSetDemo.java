package collection;

import java.util.HashSet;

public class HashSetDemo {
	public static void main(String[] args)
	{
		HashSet s = new HashSet();
		s.add("Manohar");
		System.out.println(s);
		s.add("Amit");
		System.out.println(s);
		s.add(null);
		System.out.println(s.add("Manohar"));
		s.add("Gaurav");
		System.out.println(s);
		
	}

}
