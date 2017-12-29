package interviewQuestions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Deque;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/*public class Demo {

	public static void main(String[] args) {
		List ls = new ArrayList();
		
		Set s = new HashSet<>();
		
		
        ls.add(10);
        ls.add(45);
        ls.add(12);
        ls.add(76);
        ls.add(14);
        s.addAll(ls);
        Iterator itr = ls.iterator();
        System.out.println("before sorting");
        while(itr.hasNext())
        {
        	System.out.println(itr.next());
        }
        
        Collections.sort(ls);
        Iterator itr1 = s.iterator();
        System.out.println("\n after sorting");
        while(itr1.hasNext())
        {
        	System.out.println(itr1.next());
        }
	}
}*/
/*class Test
{
	static
	{
		System.out.println("This is test static block");
	}
 
   
   Test()
   {
  	 System.out.println("This is constructor");
   }
   {
		System.out.println("This is initialization block");
	}
}

public class Demo {
	public static void main(String[] args) {
		
		Test t= new Test();
		
		
	}
	static
	{
		System.out.println("This is main static block");
	}
}	*/
/*class A
{
    static void staticMethod()
    {
        System.out.println("Static Method");
    }
}
 
public class Demo
{
    public static void main(String[] args)
    {
        A a = null;
 
        a.staticMethod();
    }
}*/

/*class A
{
    A a = new A();
    public static void display()
    {
    	System.out.println("hello");
    }
}	
public class Demo
{
    public static void main(String[] args)
    {
     A.display();
    }
}*/

/*public class Demo
{
    public static void main(String[] args)
    {
        //Integer i = new Integer(null);
 
        //String s = new String(null);
        String s = "ONE"+1+2+"TWO"+"THREE"+3+4+"FOUR"+"FIVE"+5; 
        
        System.out.println(s);
    }
}*/

/*class MyThread extends Thread
{
	
 public void run()
 {
	 for(int i = 0; i<5; i++)
	 {
	 System.out.println("child thread");
		 //System.out.println(Thread.currentThread().getPriority());
	 }
 }
}
public class Demo
{
 public static void main(String []args)
 {
	 MyThread t = new MyThread();
	 t.setPriority(10);
	 t.start();
		// System.out.println(Thread.currentThread().getPriority());
	 for(int i = 0; i<5; i++)
	 {
		 System.out.println("main thread");
	 }
 }
}*/

/*class MyThread extends Thread
{
	
 public void run()
 {
	 System.out.println("child thread");
 }
}
public class Demo
{
 public static void main(String []args)
 {
	 MyThread t = new MyThread();
	 Thread d = new Thread(t);
	 d.start();
	 System.out.println("Main Thread");
 }
}*/

// Yield Method

/*class MyThread extends Thread
{
	
 public void run()
 {
	 for(int i = 0; i<5; i++)
	 {
	 System.out.println("child thread");
	 Thread.yield();
	 }
 }
}
public class Demo
{
 public static void main(String []args)
 {
	 MyThread t = new MyThread();
	 t.start();
	 for(int i = 0; i<5; i++)
	 {
		 System.out.println("main thread");
	 }
 }
}*/

// Join Method main thread executes after finishing child thread. 

/*class MyThread extends Thread
{
	
 public void run()
 {
	 
	 for(int i = 0; i<5; i++)
	 {
		 System.out.println("child thread");
	  try
	  {
		  
	   Thread.sleep(1000);
	  }
	  catch(InterruptedException e)
	  {
		  System.out.println(e);
	  }
	 }
 }
}
public class Demo
{
 public static void main(String []args) throws InterruptedException
 {
	 MyThread t = new MyThread();
	 t.start();
	 t.join();
	 for(int i = 0; i<5; i++)
	 {
		 System.out.println("main thread");
	 }
 }
}
*/
//Join Method child thread executes after finishing main thread. 

class MyThread extends Thread {
	static Thread mt;

	public void run() {
		try {

			mt.join();
		} catch (InterruptedException e) {
			System.out.println(e);
		}
		for (int i = 0; i < 5; i++) {
			System.out.println("child thread");

		}
	}
}

public class Demo {
	public static void main(String[] args) throws InterruptedException {
		MyThread.mt = Thread.currentThread();
		MyThread t = new MyThread();
		t.start();
		
		for (int i = 0; i < 5; i++) {
			System.out.println("main thread");
			Thread.sleep(1000);
		}
	}
}
