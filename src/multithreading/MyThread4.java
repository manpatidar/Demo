package multithreading;

class TestDemo extends Thread
{
	Thread t;

	public void run()
	{
		for(int i = 0; i<5 ;i++)
		{
			System.out.println(" Running Thread is " + Thread.currentThread().getName());
			try{  
			    Thread.sleep(500);  
			   }catch(Exception e){System.out.println(e);}  
			 
			  }  
		}
	}
	
public class MyThread4  {
	

	public static void main(String[] args) throws InterruptedException {
		TestDemo d = new TestDemo();
		TestDemo d1 = new TestDemo();
		TestDemo d2 = new TestDemo();
		
		System.out.println("Main THread");
		d.start();
		try{  
			  d1.join();  
			 }catch(Exception e){System.out.println(e);}  
		d1.start();
		d2.start();
		
		
	}

}
