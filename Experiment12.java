import java.util.*;

class Character

{

	 public static void main(String args[])	 {

	 	System.out.println("Enter the string");

	 	Scanner obj = new Scanner(System.in);

	 	String m = obj.nextLine();

	System.out.println("Enter the character to be replaced");

	 	char s = obj.next().charAt(0);

	 	System.out.println("Enter the character to replace the existing character ");

	 	char r = obj.next().charAt(0);

	 	m = m.replace(s,r);

	System.out.println("Strings after replacing");

	 System.out.println(m);

	 }

}
