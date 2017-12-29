package interviewQuestions;

public class ReverseArray {
	
	public static void main(String[] args)
	{
		
		int[] a = {12,23,532,24,567,287,245,42,17};
		int temp = 0;
		System.out.println("Before reverse");
		for(int i = 0; i< a.length; i++)
		System.out.print(a[i] + " ");
		int len = a.length;
		for(int i = 0;i <= len/2;i++)
		{
			temp = a[i];
			a[i] = a[--len];
			a[len] = temp;
			
			
		}
		System.out.println("\nAfter reverse");
		for(int i = 0; i< a.length; i++)
		System.out.print(a[i] + " ");
	}

}
