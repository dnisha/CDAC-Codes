package ArrayLab;

import java.util.Scanner;

public class Question5 {

	public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter The length of array :");
		int l = sc.nextInt();

		int a[] = new int [l];
		
		for(int i =0 ; i<l;i++) {
			System.out.println("Enter value of array at index "+i);
			a[i] = sc.nextInt();
		}
		
		
		int count = 1;
		while(count<l) {
		for(int i = 0;i<l-count;i++) {
			
			if(a[i] > a[i+1]) {
				
				int temp = a[i];
				a[i] = a[i+1];
				a[i+1] = temp;
			}
			
		}
		count++;
		}
		
		System.out.println("Sorted array are : ");

		for(int i =0 ; i<l;i++) {
			System.out.print(a[i]+" ");
		}

	}

}
