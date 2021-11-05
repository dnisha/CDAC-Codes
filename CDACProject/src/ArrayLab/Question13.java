package ArrayLab;

import java.util.Scanner;

public class Question13 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the length og array");
		int l = sc.nextInt();
		int a[] = new int [l];
		int b[] = new int[l];
		
		for(int i =0 ; i<l;i++) {
			System.out.println("Enter value of array at index "+i);
			a[i] = sc.nextInt();
		}
		System.out.println("The array value is :");
		for(int i =0 ; i<l;i++) {
			System.out.print(" "+a[i]);
			
		}

		int max = a[l-1];
		b[0] = max;
		int count =1;
		for(int i=l-1;i>=0;i--) {
			
			if(a[i] > max) {
				max = a[i];
				b[count] = a[i];
				count++;
				
			}
		
		}
		
		System.out.println();
		System.out.println("The ladde value: ");
		for(int i =0 ; i<count;i++) {
			System.out.print(" "+b[i]);
			
		}

	}

}
