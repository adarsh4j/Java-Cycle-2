import java.util.*;

class Experiment11

{

	 public static void main(String args[])	 {

	 	int i,flag=0;

	 	System.out.println("Enter the string");

	 	Scanner obj = new Scanner(System.in);

	 	String m = obj.nextLine();

	     int n = m.length();

	     m= m.toLowerCase();

	System.out.println("Enter the character to be searched");

	 	char s = obj.next().charAt(0);

	 for(i=0;i<n;i++)

	 {

	 	if(m.charAt(i)==s)

	 	{

	 		flag=1;

	 		break;

	 	}

	 }

	 if(flag==1)

	 System.out.println("The element is present at "+(i+1));

	 else

	    System.out.println("The element is not present");

	 }

}
