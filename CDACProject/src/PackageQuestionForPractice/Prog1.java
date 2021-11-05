package PackageQuestionForPractice;

import java.util.Scanner;

import Interface.inter1;

public class Prog1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a number : ");
		
		int a = sc.nextInt();
		
		try {
			int b = 10/a;
			System.out.println("Division " + b);
			
		} catch (Exception e) {
			e.getStackTrace();
			System.out.println("ArithmeticException ");
			
		}
		
	}

}
