package interviewQuestions;

 abstract class test
{
 abstract void show();
 
 
 void display()
 {
		System.out.println("Its display");
		
}
}
class result extends test
{

	@Override
	void show() {
		System.out.println("Its show result");
		
	}
	
	
}
public class AbstractClass {

	public static void main(String[] args) {
     
     test t1 = new result();
     t1.display();
     t1.show();
	}

}
