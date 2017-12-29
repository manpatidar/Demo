package interviewQuestions;

public class DuplicateNumberInArray {

	public static void main(String[] args) {

		int a[] = {2,1,4,2,3,1,4,5,6,7};
		try
		{
		for(int i =0;i<10;i++)
		{
			if(a[Math.abs(a[i])]>=0)
			{
				a[Math.abs(a[i])] = -a[Math.abs(a[i])];
			}
			else
			{
				System.out.println(Math.abs(a[i]));
			}
		}
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}

}
