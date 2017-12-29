package ExceptionHandling;

public class CustomeException {

	public static void main(String[] args) throws MyException {

		int a = 1;
		try
		{
			if(a == 1)
			{
				throw new MyException("Exception found");
			}
		}
		catch(Exception e)
		{
			System.out.println(" exception " + e);
		}
	}

}
