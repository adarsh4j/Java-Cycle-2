import java.util.*;

class Experiment10

{

	 public static void main(String args[])	 {

	 System.out.println("Enter the string");

	 Scanner obj = new Scanner(System.in);

	 String name = obj.nextLine();

     int n = name.length();

     int flag=0,i,j;

     for(i=n-1,j=0;i>=0&&j<n;i--,j++)

     {

     	if(name.charAt(i)==name.charAt(j))

     	{

     		flag=1;

     	}

     }

     if(flag==1)

        System.out.println("The string is palindrome");

     else

        System.out.println("The string is not palindrome");

	 }

}

	
