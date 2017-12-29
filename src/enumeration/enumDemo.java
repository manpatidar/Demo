package enumeration;

enum months
{
 JAN,FEB,MAR,APR,MAY,JUN,JUL,AUG,SEP,OCT,NOV,DEC;	

}
public class enumDemo {

	public static void main(String[] args) {
   
		
		for(months m : months.values())
		{
			System.out.println(m);
		}
	}

}
