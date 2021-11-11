package generic;

//A Simple Java program to demonstrate that NOT using
//generics can cause run time exceptions
import java.util.*;

//Using generics converts run time exceptions into
//compile time exception.
import java.util.*;

class Demo2
{
	public static void main(String[] args)
	{
		// Creating a an ArrayList with String specified
		ArrayList <String> al = new ArrayList<String> ();

		al.add("Sachin");
		al.add("Rahul");

		// Now Compiler doesn't allow this
//		al.add(10);
System.out.println(al.get(0));

System.out.println(	al.get(1));
System.out.println(		al.get(2));


	}
}
