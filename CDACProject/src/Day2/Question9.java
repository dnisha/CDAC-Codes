package Day2;
import java.util.*;

public class Question9 {

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
		 System.out.println("Enter any number : ");
		 
		 int x = sc.nextInt();
		 
		 int remainder = x%10;
		 int SumEven = 0;
		 int SumOdd = 0;
		 for( ;x != 0;x = x/10) {
			 remainder = x%10;
			 if(remainder%2 == 0 ) {
				 SumEven = SumEven + remainder ;
				 
				 
			 }
			 else {
				 SumOdd = SumOdd + remainder ;
				
			
			 }

		 }
		 System.out.println("Sum of even Digit in number :"+ SumEven);
		 System.out.println("Sum of even Digit in number :"+ SumOdd);
		 
		
	}

}
