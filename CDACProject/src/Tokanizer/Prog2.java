package Tokanizer;

import Interface.inter1;

public class Prog2 {

	public static void main(String[] args) {
	
		StringBuffer s1 = new StringBuffer("MADAM");
		int l = s1.length()-1;
		boolean palidrome=false;
		for(int i=0;i<s1.length()/2;i++) {
			
			if ( 	s1.charAt(i) == s1.charAt(l)) {
				l--;
				
				palidrome = true;
			}
			else {
				palidrome = false;
				break;
			}
		}
		if (palidrome == true) {
			System.out.println("Its A palindrome");
		}
		else {
			System.out.println("Not a palindrome");
		}
		
	

	}

}
