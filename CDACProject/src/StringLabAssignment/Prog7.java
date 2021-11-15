package StringLabAssignment;

import java.util.Scanner;

import Interface.inter1;

public class Prog7 {
	
	static void takeInput() {

		//Java Program To Capitalize 1st Letter Each Word In String
		String s1 = "welcome to java";
		
        String[]a = s1.split(" ");
		
	for (String b : a) {
		System.out.print(b.substring(0,1).toUpperCase()+b.substring(1,b.length())+" ");
	}
	
		}
	
	
	


	public static void main(String[] args) {

		takeInput();

	}

}
