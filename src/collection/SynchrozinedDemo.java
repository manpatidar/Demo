package collection;

class Display{
	
	public synchronized void show(String name)
	{
		
		for(int i=0; i<10; i++)
		{
			try
			{
				Thread.sleep(1000);
			}
			catch(InterruptedException e)
			{
				System.out.println(e);
			}
			System.out.println(name);
		}
	}
	
}

class MyThread2 extends Thread
{
	String name;
    Display d;
	MyThread2(Display d, String name)
	{
		this.d = d;
		this.name = name;
	}

	public void run()
	{
		
		d.show(name);
	}
}
public class SynchrozinedDemo {

	public static void main(String[] args) {
		
		Display d = new Display();
		
		MyThread2 t1 = new MyThread2(d,"Thread 1");
		MyThread2 t2 = new MyThread2(d,"Thread 2");
		t1.start();
		t2.start();

	}

}
