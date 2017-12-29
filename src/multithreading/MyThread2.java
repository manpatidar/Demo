package multithreading;

class Test2 implements Runnable
{
	Thread t;
	public String str;
	Test2(String str)
	{
		this.str = str;
		t = new Thread(this,str);
		System.out.println(t);
	}
	public void run()
	{
		for(int i = 0;i<5;i++)
		{
			
			System.out.println(str + ": " + i);
	
		}
	}

}
public class MyThread2 {

	public static void main(String[] args)
	{
		Test2 m= new Test2("child thread");
		m.run();
		try{
			
			for(int i =0;i<5;i++)
			{
				System.out.println("Main Thread "+ i);
				Thread.sleep(1000);
			}
		}catch(InterruptedException e)
		{
			System.out.println("Main thread interrupted");
			
		}
		System.out.println("Main thread finished");	
	}
}
