package interviewQuestions;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

class Student5
{
 String name;
 int age;
 
 public Student5(String str, int a) {
   name = str;
   age = a;
 }
void display()
 {
	 System.out.println(name + age);
 }
}

public class SetDemo {

	public static void main(String[] args) {

		Set<Student5> st = new HashSet<Student5>();
		Student5 s1 = new Student5("Manohar",27);
		Student5 s2 = new Student5("Manohar",27);
		
		st.add(new Student5("Manohar",27));
		st.add(new Student5("Manohar",27));
		//s1.display();
		//s2.display();
		Iterator itr = st.iterator();
		while(itr.hasNext())
		{
			Student5 s =(Student5) itr.next();
			System.out.println(s.name + s.age);
		}
	}

}
