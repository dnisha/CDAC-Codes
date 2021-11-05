package Day2;
import java.util.*;

public class Question6 {

	public static void main(String[] args) {
		  Scanner sc = new Scanner(System.in);
		  System.out.println("Enter Any number ");
		  int n = sc.nextInt();
		  int a = 0;
		  int b = 1;
		  int c;
		 
		  System.out.print(a+" ");
		  System.out.print(b+" ");
		  for(int i = 1 ; i<=n ; i++) {
			  
			  c = a+b;
			System.out.print(c+" ");
		
		a= b;
		b = c;
			
		  }

	}

}
