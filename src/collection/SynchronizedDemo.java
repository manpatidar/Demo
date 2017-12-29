package collection;

class MyThread1 implements Runnable {
	 
	
	public void run() {
		
		synchronized(this)
		{
		for (int i = 0; i < 5; i++) {
			System.out.println("child thread" + Thread.currentThread().getName());

		}
		}
	}
}

public class SynchronizedDemo {
	
	public static void main(String[] args) throws InterruptedException {
		
		MyThread1 r = new MyThread1();
		Thread t1 = new Thread(r,"Thread 1");
		Thread t2 = new Thread(r,"Thread 2");
		Thread t3 = new Thread(r, "Thread 3");
		t1.start();
		t2.start();
		t3.start();
	}
}
