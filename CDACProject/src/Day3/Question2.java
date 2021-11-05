package Day3;
import java.util.*;

public class Question2 {

	public static void main(String[] args) {
		
		 Scanner sc = new Scanner(System.in);
			
		 int a[] = new int [7];
		 int c = 0;
		
	     
		 for(int i=0;i<7;i++) {
			 System.out.println("Enter the numbers :");
			 a[i] = sc.nextInt();
		 }
		 
		 System.out.println("Enter the value to be searched ");
		 int b = sc.nextInt();
		 
		 for(int i=0;i<7;i++) {
			if (b==a[i]) {
				c=1;
			}
		}
		 if( c==1) {
			 System.out.println("Found");
		 }
		 else {
			 System.out.println("Not Found");
			 
		 }
		
			
			 
		
		 
		 

	}

}
