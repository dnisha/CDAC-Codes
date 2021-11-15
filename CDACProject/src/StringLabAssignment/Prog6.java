package StringLabAssignment;

import java.util.Iterator;
import java.util.Scanner;

import javax.naming.directory.NoSuchAttributeException;

import Interface.inter1;

public class Prog6 {
	//Revese String
	static void takeInput() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter String : ");
		
	String s1 = sc.nextLine();
//		String s1 = "My Name Is Khan";
	String [] s =	s1.split(" " );
	String []s2 = new String[s.length];
	
	int j=0;
for(int i=s.length-1;i>=0;i--) {
	s2[i] = s[j];
	j++;
}
System.out.print("Reversed String : ");
for (String s3 : s2) {
	System.out.print(s3+" ");
}
}


	public static void main(String[] args) {
		
		takeInput();
	}

}
