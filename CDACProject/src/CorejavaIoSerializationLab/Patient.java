package CorejavaIoSerializationLab;

import java.io.NotSerializableException;
import java.io.Serializable;
import java.util.Scanner;

import Interface.inter1;

public class Patient implements Serializable {
	String patientName;
	int id,mobile;
	String address;
	
	
	void getData(){
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Name");
		patientName = sc.nextLine();
		
		System.out.println("Enter id");
		id = sc.nextInt();
		
		System.out.println("Enter Mobile");
		mobile = sc.nextInt();
		
		System.out.println("Enter address");
		address= sc.next();
		
	}
	
	void display() {
		System.out.println(" Name : "+patientName);
		System.out.println(" id : "+id);
		System.out.println(" Mobile : "+mobile);
		System.out.println(" address : "+address);
	
		
	}

}
