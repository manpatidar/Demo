package interviewQuestions;

public class MinMaxNumber {

	public static void main(String [] args)
	{
		int max=0,min=0;
		int[] a = {12,23,532,24,567,287,245,42,17,24,253465,243,6756};
		System.out.println(a.length);
		max = a[0];
		min = a[0];
		for(int i=0;i<a.length;i++)
		{
			if(max < a[i])
				max = a[i];
			if(min > a[i])	
			    min = a[i];
			
		}
		System.out.println("max element is " + max);
		System.out.println("max element is " + min);
			
		
	}
}
