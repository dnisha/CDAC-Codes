package Day2;
import java.util.*;

public class Question3 {

	public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a number");
		int a = sc.nextInt();
	int reverse=0;
	
	for(;a!=0;a = a/10) {
		
		int remainder = a%10;
		reverse = reverse *10+ remainder;
	}
	System.out.println(reverse);
		
		
		

	}

}
