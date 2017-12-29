package interviewQuestions;

import java.util.HashMap;
import java.util.Map;

class Dog{
	
	public String name;
	public Dog(String n)
	{
		name = n;
	}
	public boolean equals(Object o)
	{
		
		if((o instanceof Dog) && (((Dog)o).name==name))
        { return true;
        }
        else
        	return false;
	}
	
	public int hashCode()
	{
		return name.length();
	}
}
class Cat { }

enum PAT {DOG,CAT,HORSE};	

public class MapTest {

	public static void main(String[] args) {
    Map<Object, Object> m = new HashMap<Object, Object>();
    m.put("k1", new Dog("Aiko"));
    m.put("k2", PAT.DOG);
    m.put(PAT.CAT,"CAT Key");
    Dog d1 = new Dog("Sheru");
    m.put(d1,"Dog Key");
    m.put(new Cat(),"Cat Key");
    System.out.println(m.get("k1"));
    String k2 = "k2";
    System.out.println(m.get("k2"));
    PAT p = PAT.CAT;
    System.out.println(m.get(p));
    System.out.println(m.get(d1));
    System.out.println(m.get(new Cat()));
    System.out.println(m.size());
    
		
	}

}
