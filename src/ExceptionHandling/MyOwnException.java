package ExceptionHandling;

class overAge extends RuntimeException 
{
 overAge(String name)
 {
	 System.out.println(name);
 }
}

class underAge extends RuntimeException
{
 underAge(String name)
 {
	 System.out.println(name);
 }
}

public class MyOwnException {

	public static void main(String[] args) {
    // int age =Integer.parseInt(args[0]);
		int age = 15;
     if(age>60)
     {
    	 throw new overAge("crossed the age limit");
     }
     else if(age<18)
     {
    	 throw new underAge("you are under age");
     }
     else
     {
    	 System.out.println("Welcome to the younger group");
     }
     
	}

}
