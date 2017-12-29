package collection;

import java.util.Collections;
import java.util.Comparator;
import java.util.TreeSet;


class Employee1 implements Comparator<Object>
{
	String emp_name;
	public String getEmp_name() {
		return emp_name;
	}
	public void setEmp_name(String emp_name) {
		this.emp_name = emp_name;
	}
	public int getEmp_id() {
		return emp_id;
	}
	public void setEmp_id(int emp_id) {
		this.emp_id = emp_id;
	}
	int emp_id;
	Employee1(String name, int id)
	{
		this.emp_name = name;
		this.emp_id = id;
	}
	public String toString()
	{
		
		return 	emp_name+"--"+emp_id;
	}
	public int compareTo(Object obj2)
	{
		int eid1 = this.emp_id;
		Employee1 e = (Employee1)obj2;
		int eid2 = e.emp_id;
		if (eid1<eid2)
			return -1;
		else if (eid1>eid2)
			return +1;
		else
			return 0;
		
		
	}
	@Override
	public int compare(Object o1, Object o2) {
		// TODO Auto-generated method stub
		return 0;
	}
}

	

public class CompCompDemo {
	public static void main(String[] args)
	{
		Employee1 e1 = new Employee1("Manohar",100);
		Employee1 e2 = new Employee1("Amit",56);
		Employee1 e3 = new Employee1("Gaurag",150);
		Employee1 e4 = new Employee1("Sudheer",18);
		Employee1 e5 = new Employee1("Ratnesh",30);
		TreeSet<Employee1> t = new TreeSet<Employee1>();

		t.add(e1);
		t.add(e2);
		t.add(e3);
		t.add(e4);
		t.add(e5);
		System.out.println(t);
		
		/*Collections.sort(t, new Comparator<Employee1>(){
			public int compare(TreeSet obj1,TreeSet obj2)
			{
				
				
				return obj1.getEmp_name().compateTo(obj2.getEmp_name());
				
				
			}
		});*/

		

				
	}

}
