package collection;
class student
{
	
	student()
	{
		
	}
	public void display(int i)
	{
		System.out.println("student number " + i );
	}
}

public class StudentDemoObject {
	public static void main(String[] args)
	{
		student[] s = new student[10];
	
		
		for(int i=0;i<10;i++)
		{
			s[i] = new student();
		}
		for(int i=0;i<10;i++)
		{
			s[i].display(i+1);
		}
	}

}
