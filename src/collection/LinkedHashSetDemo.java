package collection;

import java.util.*;

public class LinkedHashSetDemo {

	public static void main(String[] args)
	{
		LinkedHashSet s = new LinkedHashSet();
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
