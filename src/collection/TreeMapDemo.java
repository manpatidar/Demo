package collection;

import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;

class TreeComparator implements Comparator<String> {

	/*@Override
	public String toString() {
		return "TreeComparator [getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()="
				+ super.toString() + "]";
	}*/
	
	
	@Override
	public int compare(String o1, String o2) {
		return -o2.compareTo(o1);
	}

}
public class TreeMapDemo {

	public static void main(String[] args) {

		Map<String, String> tm = new TreeMap<String, String>(new TreeComparator());

		tm.put("Delhi", "24");
		tm.put("Mumbai", "32");
		tm.put("Chennai", "35");
		tm.put("Bangalore", "22");
		tm.put("Kolkata", "28");

		// iterating the map
		for (Map.Entry<String, String> me : tm.entrySet()) {
			System.out.println(me.getKey() + " " + me.getValue());
		}
	}

	

}
