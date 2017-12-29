package interviewQuestions;

interface interfacedemo
{
 String name = "manohar";
 int age = 27;
 void show();	
}
class test1 implements interfacedemo
{
    test1()
    {
    	
    }
	@Override
	public void show() {
		System.out.println(name + " " + age);
		
	}
	
}
public class Interface{

	public static void main(String[] args) {

		test1 t1 = new test1();
		t1.show();
	}

	

}
