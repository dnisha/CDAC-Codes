package ArrayLab;

import java.util.Scanner;

public class Question14 {

	public static void main(String[] args) {
	
		
			Scanner sc = new Scanner(System.in);

			int a[] = new int [6];
			int l = a.length-1;
			
			for(int i =0 ; i<6;i++) {
				System.out.println("Enter value of array at index "+i);
				a[i] = sc.nextInt();
			}
			System.out.println("The array value is :");
			for(int i =0 ; i<6;i++) {
				System.out.print(" "+a[i]);
				
			}
			System.out.println();
			System.out.println("Enter the number of times u want to shift array to clock wise");
			
			int b =sc.nextInt();
			int temp[] = new int[6];
			int j=0;
			for(int i = l-b+1;i<=l;i++) {
				
				temp[j] = a[i];
				j++;
			}
//			System.out.println("The array value j "+temp[0]);
//			System.out.println("The array value j "+temp[1]);
			
			for(int i=6-b-1;i>=0;i--) {
				
				a[l] = a[i];
				l--;
				
			}
			j=0;
			for(int i=0;i<b;i++) {
				a[i] = temp[j];
				j++;
			}
			
//			Rotated Array
			System.out.println("The array value is :");
			for(int i =0 ; i<6;i++) {
				System.out.print(" "+a[i]);
				
			}
		

	}

}
