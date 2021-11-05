package Day3;
import java.util.*;

public class Question1 {

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
		
		 int a[] = new int [5];
		 int temp=0;
		 
		 
		 for(int i=0;i<5;i++) {
			 System.out.println("Enter the numbers :");
			 a[i] = sc.nextInt();
		 }
		 
		 
		 for(int i=0;i<5;i++) {
			temp = temp +a[i];
		 }
		 
		 System.out.println("Sum is:"+temp);

	}

}
