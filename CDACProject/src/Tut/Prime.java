package Tut;

import java .util.*;

public class Prime {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the number :");
		int num = s.nextInt();
		
		if(num ==1 && num ==0) {
			System.out.println("Not a prime number");
		}
		
		for(int i = 2; i<num;i++) {
			
			if(num%i ==0) {
				System.out.println("is not prime number");
				break;
			}
			else
				System.out.println("Is prime");
			break;
		}
		
	}

}
