package StringLabAssignment;

import java.util.Scanner;

public class Prog2 {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter First String : ");
String s1 = sc.next();

System.out.println("Enter Second String : ");
String s2 = sc.next();

System.out.println("String after Concatenation : "+s1.concat(s2));

	}

}
