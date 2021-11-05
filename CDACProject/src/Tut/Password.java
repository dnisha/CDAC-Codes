package Tut;

import java.util.*;

public class Password {
	
	public static void main (String args[]){
		
		
		System.out.println("Enter your passward");
		
		
		
		int pas = 123;
		
		for(int i=0;i<3;i++) {

			Scanner sc = new Scanner(System.in);
			int num = sc.nextInt();
			if (num == pas) {
				System.out.println("Welcome ");
				break;
			}
			else
				System.out.println("Wrong Password Enter your passward again ...!");
//			if(i ==3) {
//				System.out.println("Enter your passward again ...!");
//				break;
//			}
			
			continue;
		
			
			
		}
		System.out.println("Error u exceedlmit");
		
		
		
		
	}
	
	
	
	

}
