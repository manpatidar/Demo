package collection;
import java.io.RandomAccessFile;
import java.io.Serializable;
import java.util.*;

public class ArrayListDemo {

	public static void main(String[] rgs)
	{
		ArrayList l = new ArrayList();
		l.add("Manohar");
		l.add("Gaurav");
		l.add(10);
		l.add("ratan");
		l.add(null);
		System.out.println(l);
		l.remove(2);
		System.out.println(l);
		l.add(2, "Amit");
		System.out.println(l);
		l.add(2, "100");
		System.out.println(l);
		
		LinkedList l1 = new LinkedList();
		System.out.println(l instanceof Serializable);
		System.out.println(l1 instanceof Serializable);
		System.out.println(l instanceof Cloneable);
		System.out.println(l1 instanceof Cloneable);
		System.out.println(l instanceof RandomAccess);
		System.out.println(l1 instanceof RandomAccess);
		
	}
}
