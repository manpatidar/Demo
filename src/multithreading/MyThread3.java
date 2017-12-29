package multithreading;

import java.lang.*;

public class MyThread3 implements Runnable {

   Thread t;

   MyThread3(String str) {

   t = new Thread(this, str);
   // this will call run() function
   t.start();
   }

   public void run() {

   for (int i = 0; i < 5; i++) {
   // yields control to another thread every 5 iterations
   if ((i % 5) == 0) {
   System.out.println(Thread.currentThread().getName() + "   yielding control...");
               
   /* causes the currently executing thread object to temporarily 
   pause and allow other threads to execute */
   Thread.yield();
   }
   }
   
   System.out.println(t instanceof Runnable );
   System.out.println(Thread.currentThread().getName() + " has    finished executing.");
   }

   public static void main(String[] args) {
   new MyThread3("Thread 1");
   new MyThread3("Thread 2");
   new MyThread3("Thread 3");
   }
} 

/* class MyRunnable implements Runnable
{

	String name;
	MyRunnable(String str)
	{
		name = str;
		// System.out.println("Thread Details ");
	
	}
	public void run()
	{
		
		try{
			
			for(int i =0;i<5;i++)
			{
				System.out.println(name + i);
				Thread.sleep(1000);
			}
		}
		catch(InterruptedException e)
		{
			System.out.println("Thread interrupted");
		}
		System.out.println(name + "Thread ended");
	}
}
public class MyThread3 {
	
	public static void main(String[] args)
	{
		
		MyRunnable M1 = new MyRunnable("First Thread");
		MyRunnable M2 = new MyRunnable("Second Thread");
		MyRunnable M3 = new MyRunnable("Third Thread");
		Thread t1 = new Thread(M1);
		Thread t2 = new Thread(M2);
		Thread t3 = new Thread(M3);
		t1.start();
		t2.start();
		t3.start();
	
		System.out.println(t1.isAlive());
		System.out.println(t2.isAlive());
		System.out.println(t3.isAlive());
		
	}

}
*/