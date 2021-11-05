package JavaIOBasic;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import Interface.inter1;

public class Employee {
	String name;
	int age;
	float salary;
	
	void getData() throws IOException {
		
	InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		
		System.out.println("Enter name : ");
		name = br.readLine() ;
		
		System.out.println("Enter age : ");
		age = Integer.parseInt(br.readLine()) ;
		
		System.out.println("Enter salary : ");
		salary = Float.parseFloat(br.readLine()) ;
		check();
		
	}
	
	void check() {
		if(salary >20000) {
			float newsal = salary/10;
			
			salary +=newsal;
		}
		else {
			float newsal = 0.15f;
			salary +=newsal;
		}
	}
	
	void display() {
		System.out.println("Name  : "+name);
		System.out.println("Salary  : "+salary);
		System.out.println("Age  : "+age);
	}

}
