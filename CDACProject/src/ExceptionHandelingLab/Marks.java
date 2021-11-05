package ExceptionHandelingLab;

import java.util.Scanner;

import Interface.inter1;

public class Marks {
	int internal,external;
	
	



	public void setInternal() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Internal Marks : ");
		this.internal = sc.nextInt();
		try {
			if(this.internal > 40) {
				throw new InternalMarks();
			}
		}
			catch (Exception e) {
				
			}
	}


	public void setExternal() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter External Marks : ");
		this.external = sc.nextInt();
		try {
			if(this.external > 60) {
				throw new ExternalMarks();
			}
		}
			catch (Exception e) {
				
			}
	}
	
	void getData() {
		System.out.println(" External Marks : "+external);
		System.out.println("Internal Marks : "+internal);
	}



	public static void main(String[] args) {
		Marks m1 = new Marks();
	m1.setExternal();
	m1.setInternal();
	m1.getData();
	
	
	}

}
