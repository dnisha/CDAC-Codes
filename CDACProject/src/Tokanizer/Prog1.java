package Tokanizer;

import Interface.inter1;

public class Prog1 {

	public static void main(String[] args) {
	
		//Checking Palindrome or Not using string
		String s1 = "MADAM";
		
	char[]a=	s1.toCharArray();
	
	boolean palidrome=false;
	
	for(int i=0;i<a.length-1;i++) {
		for(int j=a.length-1;j>0;j--) {
		if (a[i] == a[j]) {
			palidrome = true;
		}
		else {
			palidrome = false;
		}
		}
	}
	
	if (palidrome == true) {
		System.out.println("Its a Palindrome");
	}
	else {
		System.out.println("Its not  a Palindrome");
	}

	}

}
