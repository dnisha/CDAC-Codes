package Day2;
import java.util.*;

public class Question7_1 {

	public static void main(String[] args) {
		  Scanner sc = new Scanner(System.in);
		  System.out.println("Enter Row ");
		  int r = sc.nextInt();
		  
		  System.out.println("Enter Column ");
		  int c = sc.nextInt();
		  
		  for(int i =1;i<=r;i++) {
			  for(int j = 1 ; j<=c;j++) {
				  System.out.print("* ");
			  }
			  System.out.println();
		  }
		

	}

}
