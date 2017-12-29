package collection;
import java.util.*;

class MyComparator2 implements Comparator
{
	public int compare(Object obj1,Object obj2)
	{
		
		String s1 = obj1.toString();
		String s2 = obj2.toString();
	    int l1 = s1.length();
	    int l2 = s2.length();
	    if (l1 < l2)
	        return -1;
	    else if (l1 > l2)
	        return +1;
	    else
	    	return s1.compareTo(s2);
		
	}	
}
public class TreeSetDemo3 {

	public static void main(String[] args)
	{
		TreeSet t = new TreeSet(new MyComparator2());
		t.add("MA");
		t.add(new StringBuffer("AA"));
		t.add("G");
		t.add("EEE");
		t.add(new StringBuffer("RRA"));
		t.add("AA");
		System.out.println(t);
		
	}
}

/*class MyComparator1 implements Comparator
{
	public int compare(Object obj1,Object obj2)
	{
		
		String s1 = (String)obj1;
		String s2 = (String)obj2;
	
		return -s1.compareTo(s2);
	}	
}
public class TreeSetDemo3 {

	public static void main(String[] args)
	{
		TreeSet t = new TreeSet(new MyComparator1());
		t.add("Manohar");
		t.add("Amit");
		t.add("Gaurav");
		t.add("Sudheer");
		t.add("Ratnesh");
		System.out.println(t);
		
	}
}*/
/*class MyComparator1 implements Comparator
{
	public int compare(Object obj1,Object obj2)
	{
		
		Integer I1 = (Integer)obj1;
		Integer I2 = (Integer)obj2;
	
		return I2.compareTo(I1);
	}	
}
public class TreeSetDemo3 {

	public static void main(String[] args)
	{
		TreeSet t = new TreeSet(new MyComparator1());
		t.add(10);
		t.add(20);
		t.add(5);
		t.add(25);
		t.add(16);
		System.out.println(t);
		
	}
}*/
	
	
	
