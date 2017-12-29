package ExceptionHandling;

public class MyException extends Exception {
	
	public MyException() {
		super();
		System.out.println("my exception super");
	}

	public MyException(String str) {
		super(str);
		System.out.println("my exception super");
	}


}
