import java.util.*;

class Experiment2{

	public static void main(String[] args) {   
  Scanner obj = new Scanner(System.in);

	 System.out.println("Enter the number");

	 int n = obj.nextInt();

	 int a[]=new int[20];

	 System.out.println("Enter the elements");

	 for(int i=0;i<n;i++)

	 {

	 	a[i]=obj.nextInt();

	 }

	 int small=a[0];

	  for(int i=0;i<n;i++)

	 {

	 	if(a[i]<small)

	 	{

	 		small=a[i];

	 	}

	 }

	 System.out.println("The smallest element is "+small);	 

}

}
