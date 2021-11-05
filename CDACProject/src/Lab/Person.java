package Lab;

import java.util.Scanner;

public class Person {
	
	String name;
	String address;
	
	void getData() {
		Scanner sc =new Scanner (System.in);
		
		System.out.println("Enter name of the person :");
		name = sc.next();
		
		System.out.println("Enter address of the person :");
		address = sc.nextLine();
	}
	
	void  showRecord() {
		System.out.println("Enter name of the person :"+name);
		
		System.out.println("Enter address of the person :"+address);
		
	}

}
