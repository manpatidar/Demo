package interviewQuestions;

import java.util.Scanner;

public class Factorial {
	
	private static Scanner sn;

	public static void main(String[] args)
	{
		
        int a,fact=1;
		
		sn = new Scanner(System.in);
		
		System.out.println("Enter any number");
		
		a = sn.nextInt();
	    
		for(int i =1 ;i <= a;i++)
		{
			fact = fact*i;
			
		}
		
		System.out.println("Factorial of " + a + " is " + fact);
	}

}
