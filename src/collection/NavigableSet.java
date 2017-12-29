package collection;

import java.util.SortedMap;
import java.util.TreeMap;
import java.util.TreeSet;

public class NavigableSet {

	public static void main(String[] args) {
     
		/*TreeSet t = new TreeSet();
		t.add(100);
		t.add(200);
		t.add(250);
		t.add(324);
		t.add(540);
		
		System.out.println( t.higher(300));*/
		
		TreeMap<String, String> map = new TreeMap<String, String>();
		map.put("a", "ant");
		map.put("d", "dog"); 
		map.put("h", "horse");
		
		System.out.println(map);
		
		SortedMap<String, String> submap;
		
		submap = map.subMap("b", "g"); 									 // #1 create a backed collection
		
		System.out.println(map + " " + submap); 						 // #2 show contents
		
		map.put("b", "bat");											 // #3 add to original
		
		submap.put("f", "fish");										 // #4 add to copy
		
		map.put("r", "raccoon"); 										 // #5 add to original - out of range
											// submap.put("p", "pig");   // #6 add to copy - out of range
		System.out.println(map + " " + submap); 						 // #7 show final contents
		
	}

}
