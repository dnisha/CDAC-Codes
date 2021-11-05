package Day3;
import java.util.*;

public class Question3 {

	public static void main(String[] args) {

		
		 Scanner sc = new Scanner(System.in);
			
		 int a[] = new int [5];
		 int Ceven = 0;
		 int Codd = 0;
		
	     
		 for(int i=0;i<5;i++) {
			 System.out.println("Enter the numbers :");
			 a[i] = sc.nextInt();
		 }

		 
		 for(int i=0;i<5;i++) {
			if(a[i] %2 ==0) {
				Ceven ++;
			}
			else {
				Codd++;
			}
		}
		
			 System.out.println("Total Even number are "+Ceven);
		
			 System.out.println("Total Even number are "+Codd);
			 
		
		
			
			 
		
		 
		
	}

}
