package ExceptionHandelingLab;

import Interface.inter1;

public class Prog9 {

	public static void main(String[] args) {
	
		try {
			System.out.println("Inside Try block");
			int data = 25/0;
			System.out.println(data);
		}catch(ArithmeticException e) {
			System.out.println("Exception Handeled ");
		}
		
		finally {
			System.out.println("Finally block Executed ");
		}

	}

}
