package collection;

 class demo
{
    static int i =10;
	
	void display()
	{
		System.out.println(i++);
	}

}
public class Test {

	public static void main(String[] args) {
    demo d = new demo();
    demo d2 = new demo();
    d.display();
    d2.display();
	}

}
