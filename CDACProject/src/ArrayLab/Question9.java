package ArrayLab;
import java.util.Scanner;

public class Question9 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter number of elements u want to enter :");
		
		int b = sc.nextInt();
		int a[] = new int [b];
		int  i =0;
		
		System.out.println("Enter Array Elements");
		while(i != a.length) {
			
			a[i] =sc.nextInt();
			i++;
		}
		System.out.println("Array Elements int reverse order are: ");
	
		for(int j =b-1;b>j;j--){
			if(j<0 )break;
	       System.out.print(a[j]+" ");
		
		    }
		
		

	}

}
