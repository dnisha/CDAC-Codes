package Day2;
import java.util.*;
public class Question7_4 {

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
		  System.out.println("Enter Row ");
		  int n = sc.nextInt();
		  int c = 2*n-1;
		  
		  for(int i=1;i<=n;i++) {
			 
			  for(int j=1;j<c;j++) {
				  System.out.print(" ");
				  
			  }
			  c=c-2;
			  for(int j = 1;j<=2*i-1;j++) {
				  System.out.print("*" );
			  }
			  System.out.println();
		  }

	}

}
