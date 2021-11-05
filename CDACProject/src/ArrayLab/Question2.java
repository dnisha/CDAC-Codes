package ArrayLab;
import java.util.Scanner;


public class Question2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int a[] = new int [7];
		int flag =0;
		
		for(int i =0 ; i<7;i++) {
			System.out.println("Enter value of array at index "+i);
			a[i] = sc.nextInt();
		}
//		System.out.println("The array value is :");
//		for(int i =0 ; i<7;i++) {
//			System.out.print(" "+a[i]);
//			
//		}
		int i = 0;
		System.out.println("Enter the number to be serched :");
		int b = sc.nextInt();
		
		while(i <7) {
			if(a[i] == b) {
				flag =1;
				break;
			}
			else {
				flag = 0;
				i++;
				
			}
			
		}
		if(flag == 1) {
			System.out.println("Found");
		}
		else {
			System.out.println("Not Found");
		}
	}

}
