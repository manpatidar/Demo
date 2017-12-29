package interviewQuestions;

public class SecondLargestNumber {

	public static void main(String[] args) {

		int a[] = {12,13,10,5,16,22,89,63,19,6};
		System.out.println("Before sorting array");
		for(int i=0;i<a.length;i++)
		{
		 System.out.println(a[i]);
		}
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a.length-i-1;j++)
			{
				if(a[j]>a[j+1])
				{
					int temp = a[j];
					a[j]=a[j+1];
					a[j+1]= temp;
				}
			}
		}
		System.out.println("Sorted array");
		for(int i=0;i<a.length;i++)
		{
		 System.out.println(a[i]);
		}
		System.out.println("second largest number is "+ a[a.length-2]);
		
	}

}
