package ArrayLab;

import java.util.Scanner;

public class Question_obtimizb {

	public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter The length of array :");
		int l = sc.nextInt();

		int a[] = new int [l];
		
		for(int i =0 ; i<l;i++) {
			System.out.println("Enter value of array at index "+i);
			a[i] = sc.nextInt();
		}
		
//		System.out.println("The array value is :");
//		for(int i =0 ; i<l;i++) {
//			System.out.print(" "+a[i]);
//			
//		}
		
		int x1 = a[0];
		int x2  = 1;
		
		for(int i=1;i<l;i++) {
			
			x1 = x1^a[i];
		}
		
		for(int i = 2;i<l+1;i++) {
			x2 = x2^i;
		}
		;
		
		System.out.println("Missing Value in array: "+x2);
		
		

	}

}
