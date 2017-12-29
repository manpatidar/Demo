package multithreading;

class Test1 extends Thread {
	
	Test1(String str)
	{
		super(str);
		System.out.println(this);
	}
	public void run()
	{
		int i;
		try{
			
			for(i=0;i<5;i++)
			{
				System.out.println(getName()+":"+i);
				Thread.sleep(10000);
			}
		}catch(InterruptedException e)
		{
			System.out.println(getName() + "interrupted");
		}
	}
	
}
public class MyThread1
{
	public static void main(String[] args)
	{
		Test1 M = new Test1("Manohar");
		M.start();
		try{
			for(int i=0;i<5;i++)
			{
				System.out.println("Main Thread "+ i);
				Thread.sleep(1000);
			}
		}
		catch(InterruptedException e)
		{
			System.out.println("Main Thread interrupted");
		}
		System.out.println("Main Thread finished");
	}

}	
