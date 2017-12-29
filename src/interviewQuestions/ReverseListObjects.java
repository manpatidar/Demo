package interviewQuestions;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class ReverseListObjects {

	public static void main(String[] args) {

		List l1 = new ArrayList();
		l1.add(10);
		l1.add(20);
		l1.add(30);
		l1.add(140);
		l1.add(15);
		l1.add(12);
		l1.add(16);
		Iterator itr = l1.iterator();
		System.out.println("Before reverse");
		while(itr.hasNext())
		System.out.println(itr.next());
		
		Collections.reverse(l1);
		Iterator itr1 = l1.iterator();
		System.out.println("After reverse");
		while(itr1.hasNext())
		System.out.println(itr1.next());
	}

}
