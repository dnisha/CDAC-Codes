package ArrayLab;

import java.util.Scanner;

public class Question3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int a[] = new int [5];
	
		int codd = 0;
		int ceven = 0;
		
		for(int i =0 ; i<5;i++) {
			System.out.println("Enter value of array at index "+i);
			a[i] = sc.nextInt();
		}
		int i=0;
		while(i != a.length) {
			if(a[i]%2 == 0) {
				ceven++;
				i++;
			}
			else {
				codd++;
				i++;
			}
		}
		
		System.out.println("Number of Even Numbers :"+ ceven);
		System.out.println("Number of Even Numbers :"+ codd);

		
	}
}
