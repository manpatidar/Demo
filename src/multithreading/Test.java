package multithreading;

public class Test extends Thread {
	public static void main(String[] args)
	{
		Thread th = Thread.currentThread();
		
		System.out.println("current thread " + th);
		th.setName("My Thread");
		System.out.println("current thread " + th);
		try{
			
			for(int i = 0;i<5;i++)
			{
				System.out.println(i);
				Thread.sleep(1000);
			}
		}
		catch(InterruptedException obj)
		{
			
			System.out.println("Main thread intercepted");
		}
	}

}
