package interviewQuestions;

class Student
{
	String name = "Manohar";
	Student(String str)
	{
		name = str;
	}
	void display()
	{
		System.out.println("Name is " + name);
	}
}
public class StudentDemo {

	public static void main(String[] args) {

		final Student s1 = new Student("Patidar");
		Student s2  = new Student("Gaurav");
		s1.name = "Ratlam";
		s1.display();
	}

}
