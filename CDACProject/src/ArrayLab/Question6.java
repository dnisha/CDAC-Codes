package ArrayLab;

import java.util.Scanner;

public class Question6 {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);

		int a[] = new int [5];
		int flag = 1;
		
		for(int i =0 ; i<5;i++) {
			System.out.println("Enter value of array at index "+i);
			a[i] = sc.nextInt();
		}
//		System.out.println("The array value is :");
//		for(int i =0 ; i<5;i++) {
//			System.out.print(" "+a[i]);
//
//	}
		System.out.println("Enter the value whose index u want to find :");
		int b = sc.nextInt();
		
		for(int i =0 ; i<5;i++) {
			if(a[i] == b) {
				flag = 1;
				System.out.println("The index of value is "+i);
				break;
			}
			else {
				flag=0;
			}
		}
		if(flag == 0) {
			System.out.println(b+" Element is not present in this array ");
		}

	}
}
