package ArrayLab;

import java.util.Scanner;

public class Question11 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter The length of array :");
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
		System.out.println();
		System.out.println("Missing Element in Array: ");
		int num = 1;
		for(int i=0;i<l;i++) {
			if(num == a[i]) {
				num++;
			}
			else {
				break;
			}
			
		}
		
		System.out.println(num);
	}

}
