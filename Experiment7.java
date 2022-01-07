import java.util.*;

public class Experiment7 {

	public static void main(String[] args) {				

		Scanner obj = new Scanner(System.in);

		int a[][]=new int [10][10];

		System.out.println("Enter the number of row: ");

		int row = obj.nextInt();

		System.out.println("Enter the number of column: ");

		int col = obj.nextInt();

		int i,j;

		System.out.println("Enter the elements: ");

		for(i=0;i<row;i++)

		{		

			for(j=0;j<col;j++)

			{

			a[i][j]=obj.nextInt();

		    }

		}

		System.out.println("The tranpose matrix is");	

		for(i=0;i<col;i++)

		{

			for(j=0;j<row;j++)

			{

			   System.out.print(a[j][i]+" ");	 

		    }

		    System.out.println();

		}	

	}

}
