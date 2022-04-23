import java.util.*;

public class Experiment3 {

	public static void main(String[] args) {	
  Scanner obj = new Scanner(System.in); 

	System.out.printf("Enter the number of element:\n ");

	        int n = obj.nextInt();

	        int a[] = new int[20];

	        System.out.printf("Enter the elements:\n ");

	        int i;

	        for(i=1;i<=n;i++)

	        {

	          a[i]=obj.nextInt();

	        }

	        System.out.printf("Enter the element to be inserted:\n");

	        int b = obj.nextInt();

	        System.out.printf("Enter the position to insert element: \n");

	        int index = obj.nextInt();

	        System.out.printf("The array become: \n");

	        for(i=1;i<=n;i++)

	        {

	        	if(i==index)

	        	{

	        		a[i]=b;

	        	}

	        	System.out.printf("%d ",a[i]);

	        }

	        		

	}
