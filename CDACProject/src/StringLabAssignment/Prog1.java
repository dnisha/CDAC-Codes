package StringLabAssignment;

import java.util.Scanner;

import Interface.inter1;
import phone.accept;

public class Prog1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String  s1 = "Deepak Nishad";
		char a[] =new char[s1.length()];
		
		for(int i=0;i<s1.length();i++) {
			a[i]=s1.charAt(i);
		}
		
		
		try {
			System.out.println("Enter The index whose character you want :");
			int i=sc.nextInt();
			
			if (i==6) {
				System.out.println("Space");
			}
			System.out.println("Character at index "+i+" is : "+a[i]);
		} catch (Exception e) {
		System.out.println("Out Of Index");
		}
		
		
		

	}

}
