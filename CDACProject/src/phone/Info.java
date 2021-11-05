package phone;

import java.util.Scanner;

public class Info extends Department implements College {

	public void getData() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter name :");
		name = sc.next();
		
		System.out.println("Enter Qualification :");
		qualy = sc.next();
		
		System.out.println("Enter Department Number :");
		dpt_no = sc.nextInt();
		
		System.out.println("Enter Department Name :");
		dpt_name = sc.next();
		
	}
	
	void displayData() {
		System.out.println("Name : "+name);
		System.out.println("Qualification  : "+qualy);
		System.out.println("Department Number  : "+dpt_no);
		System.out.println("Department Name  : "+dpt_name);
	}
	public static void main(String[] args) {
		Info i1 = new Info();
		i1.getData();
		i1.displayData();
		
	

	}

}
