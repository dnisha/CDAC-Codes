package Exception_Handeling;

import java.util.Scanner;

import Interface.inter1;

public class Exception1 {

	public static void main(String[] args) throws Exception{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter password :");
		
		int a =sc.nextInt();
		
		
		if(a==1234) {
			System.out.println("WELCOME");
		}
		else {
			throw new Exception();
			
			
		}

	}

}
