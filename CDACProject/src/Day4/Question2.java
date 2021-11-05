package Day4;

import java.util.Scanner;

public class Question2 {

	public static void main(String[] args) {
		Scanner s1 = new Scanner(System.in);
		
		System.out.println("Enter The name of Person");
		String str = s1.nextLine();
		int count =0;
		
		
		for(int i =0;i<str.length();i++) {
			
			 if( str.charAt(i) == 'a' || str.charAt(i) == 'e' ||str.charAt(i) == 'i'||str.charAt(i) == 'o'||str.charAt(i) == 'u'||str.charAt(i) == 'A'||str.charAt(i) == 'E'||str.charAt(i) == 'I'||str.charAt(i) == 'O'||str.charAt(i) == 'U') {
				 count++;
			 }
			
		}
		
		System.out.println("Number Of vowels are: "+count);
	}

}
