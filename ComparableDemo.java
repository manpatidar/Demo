package collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

class Employee implements Comparable{
	
	String name;
	int id;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Employee(String name, int id)
	{
		this.name=name;
		this.id=id;
	}
	
	public int CompareTo(Object in)
	{
		return new Integer(this.id).compareTo(((Employee)in).id);
	}
	@Override
	public int compareTo(Object o) {
		// TODO Auto-generated method stub
		return 0;
	}
}
public class ComparableDemo {

	public static void main(String[] args) {
    
		Employee e1 = new Employee("Manohar",101);
		Employee e2 = new Employee("Amit",102);
		Employee e3 = new Employee("Gaurav",108);
		Employee e4 = new Employee("Ratan",104);
		
		ArrayList al= new ArrayList();
		al.add(e1);
		al.add(e2);
		al.add(e3);
		al.add(e4);
		
		Collections.sort(al);
		Iterator itr = al.iterator();
		while(itr.hasNext())
		{
			Employee em = (Employee)itr.next();
			System.out.println(em.getId()+ " " + em.getName());
		}
		
	}

}
