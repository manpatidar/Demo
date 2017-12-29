package collection;
import java.util.*;


public class VectorDemo1 {

	public static void main(String[] args)
	{
		
		Vector v = new Vector();
		LinkedList l =new LinkedList();
		l.add("Manohar");
		 l.add("Gaurav");
		 l.add("100");
		 l.add("200");
		 System.out.println(l);
		System.out.println(v.capacity());
		v.addElement("Manohar");
		v.addElement("100");
		System.out.println(v);
		Vector v1 = new Vector(l);
		System.out.println(v1);
		v1.remove(2);
		System.out.println(v1);
		v1.removeElement("Manohar");
		System.out.println(v1);
		
	}
}
