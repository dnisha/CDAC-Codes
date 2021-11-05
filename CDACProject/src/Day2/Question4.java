package Day2;
import java.util.*;

public class Question4 {

	public static void main(String[] args) {
		   Scanner sc = new Scanner(System.in);
		 
			 int c = 0;
			do {
			
			
					System.out.println("Enter first number");
					int a = sc.nextInt();
					
					System.out.println("Enter Second number");
					int b = sc.nextInt();
					
					System.out.println("Sum of Numbers is : "+ (a+b));
					
					System.out.println("You want to perform it againg Y/N : ");
					char x = sc.next().charAt(0);
					
					if(x == 'Y' || x == 'y') {
						c = 1;
						
					}
					else {
						c=0;
					}
					
					
			}
			while(c == 1);
	}

}
