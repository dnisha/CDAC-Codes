package Tut;
import java .util.*;


public class Question17 {
	public static void main (String args []) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any letter");
		char x = sc.next().charAt(0);
		
		if (x== 'a' || x== 'e'||x== 'i'||x== 'o'||x== 'u') {
			System.out.println("It is a vowel");
		}
		else if(x== 'A' || x== 'E'||x== 'I'||x== 'O'||x== 'U') {
			System.out.println("It is a vowel");
		}
		else {
			System.out.println("It is a Consonant");
		}
		
		
		
		
		
		
	}

}
