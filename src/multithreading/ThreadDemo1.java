package multithreading;


public class ThreadDemo1 extends Thread {

	static int j=1;

	public void run() {
		for (int i = 0; i < 10; i++) {

			System.out.println("my rubbable " + Thread.currentThread().getName() + " " + i + " " + j++);
		}

	}

	public static void main(String[] args) {

		ThreadDemo1 d1 = new ThreadDemo1();
		ThreadDemo1 d2 = new ThreadDemo1();
		d1.setName("Manohar");
		d1.start();

		d2.setName("Patidar");
		d2.start();

	}

}
