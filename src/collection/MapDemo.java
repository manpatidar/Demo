package collection;
import java.util.*;

public class MapDemo {

	public static void main(String[] args)
	{
		HashMap m = new HashMap();
		LinkedHashMap m1 = new LinkedHashMap();
		m.put(1, "Manohar");
		m.put(2, "Gaurav");
		m.put(3, "100");
		m.put(3, "400");
		m.put(4, null);
		m.put(5, "400");
		m.put(null, null);
		m.put(null,2345);
		m1.putAll(m);
		System.out.println(m);
		System.out.println(m1);
		System.out.println(m.get(3));
		System.out.println(m.containsValue("Manohar"));
		System.out.println(m.keySet());
		System.out.println(m.entrySet());
	}
}
