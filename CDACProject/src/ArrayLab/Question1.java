package ArrayLab;
import java.util.*;

public class Question1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int a[] = new int [5];
		
		for(int i =0 ; i<5;i++) {
			System.out.println("Enter value of array at index "+i);
			a[i] = sc.nextInt();
		}
		System.out.println("The array value is :");
		for(int i =0 ; i<5;i++) {
			System.out.print(" "+a[i]);
			
		}
	}

}
