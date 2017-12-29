package ExceptionHandling;

import java.io.*;
public class ExceptionalDemo1 {

	static void display() throws MyException
	{
		int[] a = new int[10];

		try {
			// int b = a[10];
			throw new MyException("Array full ho gya");
			// System.out.println("value of b is " + b);
		} catch (MyException e) {
			
			
			// e.printStackTrace();
			 System.out.println("value of e is " +e);
		} finally {
			System.out.println("Its over");
		}
	}

	// private static final Exception ArrayIndexOutOfBoundsException = null;

	public static void main(String[] arg) {
		try{
			display();
		}
		catch(Exception e ){
			System.out.println("In main exception");
		}
	}
}
