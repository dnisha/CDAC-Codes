package ExceptionHandelingLab2;

import java.util.Scanner;

import Interface.inter1;

public class Student {
	
	int roll_no,age;
	String name;
	String course;
	
	public Student() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Roll Number");
		this.roll_no = sc.nextInt();
		
		System.out.println("Enter Age");
		this.age = sc.nextInt();
		
	
		try {
			if(this.age <15 || this.age >21)
				throw new AgeNotWithinRangeException();
			
		} catch (Exception e) {
			System.out.println("Age should be between 15 to 21");
		}
		
		System.out.println("Enter Name");
		this.name=sc.nextLine();
		
		
		System.out.println("Enter Course");
		this.course = sc.next();
		
		

	}
	

	public static void main(String [] args) {
		
		Student s1 = new Student();
	
		
	}

}
