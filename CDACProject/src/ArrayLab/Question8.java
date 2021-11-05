package ArrayLab;

import java.util.Scanner;

public class Question8 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int a[] = new int [5];
		
		
		for(int i =0 ; i<5;i++) {
			System.out.println("Enter value of array at index "+i);
			a[i] = sc.nextInt();
		}
		int min = a[0];
		int max = a[0];
		for(int i =0 ; i<5;i++) {
			
			if(a[i]< min) {
				min = a[i];
			}
			if(a[i]>max) {
				max = a[i];
			}
		}
		
		
		System.out.println("The max value in array is : "+max);
		System.out.println("The min value in array is : "+min);
	
	}

}
