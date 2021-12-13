import java.util.*;

class large

{

	public static void main(String[] arg){	
  Scanner sc = new Scanner(System.in);

	//Elements in n*n form//

	System.out.println("Enter the number of elements: ");

	int n = sc.nextInt();

	int[][] a = new int[n][n];

	int i,j;

	System.out.println("Enter the elements in row and column method: ");

	for(i=0; i<n; i++)

	{

		for( j=0; j<n ; j++)

		{

			a[i][j] = sc.nextInt();  

		}

	}

	int large = a[0][0];

	for( i=0; i<n; i++)

	{

		for( j=0; j<n ; j++)

		{

			if(large < a[i][j])

			{

				large = a[i][j];	   

			}

			

		}

	}

	System.out.println("The largest element is "+large);

	}

}
