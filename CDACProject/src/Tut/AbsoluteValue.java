package Tut;
import java.util.*;

public class AbsoluteValue {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		
		int a = sc.nextInt();
		
		if( a<0) {
			System.out.println(-1 * a);
		}
		else
			System.out.println( a);
	}

}
