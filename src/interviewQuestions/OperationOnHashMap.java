package interviewQuestions;

import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class OperationOnHashMap {

	public static void main(String[] args) {

		Map hm = new HashMap<Object, Object>();
		
		hm.put(1, "Manohar");
		hm.put(2, "Amit");
		hm.put(3, "ratnesh");
		hm.put(4, "Sunil");
		hm.put(5, "Sud");
		
		Collections.synchronizedMap(hm);
		
		Iterator <Map.Entry<Integer,String>> itr = hm.entrySet().iterator();
		
		
		while(itr.hasNext())
		{
			Map.Entry<Integer, String> pair = itr.next();
		    System.out.println(pair.getKey() + " " + pair.getValue()); 
		    itr.remove();
		}
		
		
	}

}
