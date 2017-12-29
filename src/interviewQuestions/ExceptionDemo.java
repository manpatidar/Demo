package interviewQuestions;

public class ExceptionDemo {

	public static void main(String[] args) {

		try{
			
			int a[] = {2,3};
			//a[3]= 4;
			System.out.println("hi");
			return;
			
		}
		catch(ArithmeticException e){
			System.out.println("First " + e);
			return;
			
		}
		catch(ArrayIndexOutOfBoundsException e){
			
			System.out.println("Second " + e);
			return;
		}
		catch(Exception e){
			System.out.println("Third " + e);
			return;
		}
		finally
		{
			System.out.println("in finally block");
			return;
		}
		
	}

}
