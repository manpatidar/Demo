package collection;

class MyThread extends Thread {
 
	public void run() {
		for (int i = 0; i < 5; i++) {
			System.out.println("child thread");

		}
		
		try {

			Thread.sleep(10000);
		} catch (InterruptedException e) {
			System.out.println(e);
		}
		
	}
}

public class InterruptTest {
	public static void main(String[] args) throws InterruptedException {
		MyThread t = new MyThread();
		t.start();
		t.interrupt();
			System.out.println("main thread");
	}
}