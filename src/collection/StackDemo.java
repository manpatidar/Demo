package collection;
import java.util.*;

import java.util.Stack;

public class StackDemo {

	public static void main(String[] args)
	{
		
		Stack s = new Stack();
		s.push("Manohar");
		s.push("Gaurav");
		s.push("Amit");
		System.out.println(s);
		System.out.println(s.search("Gaurav"));
		
	}
}
