package Day4;

public class StringPool {

	public static void main(String[] args) {
		//string is class in java
		//in java.lang

		String a="hello";//string pool
		String b="Hello";
		String c= new String("HELLO");
		String d= new String("hello");

		// this will compare address of variables
		if(a==c)
		System.out.println("equals");
		else
		System.out.println("not equals");

		//equals function will compare the values of variables
		if( a.equalsIgnoreCase(b))
		// equalsIgnore case will not check upper case or lowercase

		//if( a.equalsIgnoreCase(c))
		System.out.println("equals");
		else
		System.out.println("not equals");

		}



}
