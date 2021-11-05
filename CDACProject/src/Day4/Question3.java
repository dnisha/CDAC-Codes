package Day4;

import java.util.Scanner;

public class Question3 {

	public static void main(String[] args) {
		Scanner s1 = new Scanner(System.in);
		int Flag  = 0;
		
		System.out.println("Enter first String");
		String str1 = s1.nextLine();
		System.out.println("Enter Second String");
		String str2 = s1.nextLine();
		
		
		for(int i = 0;i<= str1.length();i++) {
			
			if(str1.charAt(i) == str2.charAt(i)) {
Flag = 1;
break;
			}
			else {
				Flag = 0;
				break;
			}
		}
		if(Flag ==1) {
			System.out.println("Equal");
		}
		else {
			System.out.println("Not Equal");
		}
	
		
		
		
		
		
	}

}
