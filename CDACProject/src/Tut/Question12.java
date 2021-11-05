package Tut;
import java.util.*;


public class Question12 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Type any alphabet");
		char x = sc.next().charAt(0);
		
		if((int)x>=97 && (int)x<=122)
		System.out.println("Lowe Case");
		
		else
			System.out.println("Upper Case");
			
		
	
		

	}

}
