package ArrayLab;

import java.util.Scanner;

public class Question7 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int a[] = new int [5];
		int b[] = new int [5];
		
		for(int i =0 ; i<5;i++) {
			System.out.println("Enter value of array at a index "+i);
			a[i] = sc.nextInt();
		}
		for(int i =0 ; i<5;i++) {
			b[i] = a[i];
		}
			
			
			
		System.out.println("The value at array b is :");
		for(int i =0 ; i<5;i++) {
			System.out.print(" "+b[i]);
			
		}
	}

}
