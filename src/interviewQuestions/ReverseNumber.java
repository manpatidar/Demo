package interviewQuestions;

import java.util.Scanner;

public class ReverseNumber {
	private static Scanner sn;

	public static void main(String[] args)
	{
		
		int a,b=0,rem=0;
		
		sn = new Scanner(System.in);
		
		System.out.println("Enter any number");
		
		a = sn.nextInt();
		System.out.println("Number before reverse "+ a);
		while(a>0)
		{
			rem = a%10;
			b = b*10 + rem;
			a = a/10;
			
		}
		
		System.out.println("Number After reverse "+ b);
		
	}	
}
