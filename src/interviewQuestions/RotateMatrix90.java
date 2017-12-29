package interviewQuestions;

public class RotateMatrix90 {
	

	public static void main(String[] args)
	{
	 int[][] a = 
			 {
		 {1,2,3},
		 {4,5,6},
		 {7,8,9}
		 };
	int i,j,N=3,temp;
	for (i=0; i<3; i++)
	{
		for (j=0;j<3; j++)
	  System.out.print(a[i][j]);
		 System.out.println("\n");
	}

	
	 System.out.println("\n");
	for(i = 0; i < N/2; ++i) {

	        for(j = 0; j < (N+1)/2; ++j) {

	             temp = a[i][j];  // save the top element;

	            a[i][j] = a[N-1-j][i];  // right -> top;

	            a[N-1-j][i] = a[N-1-i][N-1-j]; // bottom -> right;

	            a[N-1-i][N-1-j] = a[j][N-1-i];// left -> bottom;

	            a[j][N-1-i] = temp;                // top -> left;

	        }

	    }
	for (i=0; i<3; i++)
	{
		for (j=0;j<3; j++)
	  System.out.print(a[i][j]);
		 System.out.println("\n");
	}
	}


}
