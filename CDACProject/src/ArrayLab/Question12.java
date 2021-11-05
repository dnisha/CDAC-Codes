package ArrayLab;

import java.util.Scanner;

public class Question12 {

	public static void main(String[] args) {
		
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the length of array ");
			int l = sc.nextInt();
		

			int a[] = new int [l];
			
			
			for(int i =0 ; i<l;i++) {
				System.out.println("Enter value of array at index "+i);
				a[i] = sc.nextInt();
			}
			System.out.println("The array value is :");
			for(int i =0 ; i<l;i++) {
				System.out.print(" "+a[i]);
				
			}
			int min = a[0];
			int max=a[0];
			
			for(int i =0 ; i<l;i++) {
				if(a[i]<min) {
					min = a[i];
				}
				
			}
//			System.out.println("Min Array "+min);
			for(int i =0 ; i<l;i++) {
				if(a[i]>max) {
					max = a[i];
				}
				
			}
//			System.out.println("Max Array "+max);
			System.out.println();
			
			int Diff = max-min;
			
			System.out.println("Differancr between max nad min element in array is "+Diff);
	

	}

}
