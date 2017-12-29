package interviewQuestions;

public class Demo12 
{  
    void run()
    {
    	System.out.println("Vehicle is running");
    }  
 }  
 
class Bike2 extends Demo12
{  
    void run()
    {
    	System.out.println("Bike is running safely");
    	
    }  
     
    public static void main(String args[])
{  
    Demo12 obj = new Bike2();  
    obj.run();  
    
}  
}
