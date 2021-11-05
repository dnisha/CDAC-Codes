package Lab;

import java.util.Scanner;

public class Teacher extends Person {
	
	int empId;
	String dept;
	
	void getrecord() {
		Scanner sc =new Scanner (System.in);
		System.out.println("Enter EmpId :");
		empId =sc.nextInt();
		
		System.out.println("Enter employee department :");
		dept = sc.next();
	}
	
	
	void showRecord() {
		System.out.println("Enter EmpId :"+empId);
		System.out.println("Enter employee department :"+dept);
	}

	public static void main(String[] args) {
		
		Person p1 = new Person();

	}

}
