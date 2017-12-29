package interviewQuestions;

class producer extends Thread {

	public void run() {
		for (int i = 0; i < 5; i++) {
           
			System.out.println();
			
		}
	}
	
}

class consumer extends Thread {

	public void run() {
		for (int i = 0; i < 5; i++) {
           
			System.out.println();
			
		}
	}
	
}

public class ProducerConsumer {

	public static void main(String[] args) {

		producer p = new producer();
		consumer c = new consumer();
		p.start();
		c.start();

	}

}
