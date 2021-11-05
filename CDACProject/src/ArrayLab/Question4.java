package ArrayLab;

import java.util.Scanner;

public class Question4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int a[] = new int [5];
		int ar_even[] = new int [5];
		int ar_odd[] = new int [5];
		
	

		
		for(int i =0 ; i<5;i++) {
			System.out.println("Enter value of array at index "+i);
			a[i] = sc.nextInt();
		}
		int i=0;
		int j=0;
		int k = 0;
		while(i != a.length) {
			if(a[i]%2 == 0) {
		     ar_even[j] = a[i];
		      j++;
				
				i++;
			}
			else {
				ar_odd[k] = a[i];
				k++;
				i++;
			}
		}
		System.out.println("Even Numbers in array are: ");
		for(int l=0;l<j;l++) {
			System.out.print( ar_even[l]+" ");
		} 
		System.out.println();
		System.out.println("Odd Numbers in array are: ");
		
		for(int m=0;m<k;m++) {
			System.out.print( ar_odd[m]+" ");
		}
	
	

		
	}

}
