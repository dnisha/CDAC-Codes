package ArrayLab;

import java.util.Scanner;

public class Question11_obtimized {

	public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter The length of array :");
		int l = sc.nextInt();

		int a[] = new int [l];
		
		for(int i =0 ; i<l;i++) {
			System.out.println("Enter value of array at index "+i);
			a[i] = sc.nextInt();
		}

		
		int sum = (l+1)*(l+2)/2;
		System.out.println("num : "+sum);
		int sum_arr=0;
		for(int i=0;i<l;i++) {
			sum_arr += a[i];
//			System.out.println("Missing Value at array :"+sum);

		}
		
		
		System.out.println("Missing Value at array :"+(sum-sum_arr));

	}

}
