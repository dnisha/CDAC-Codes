package IoPract;

import java.io.Serializable;

import Interface.inter1;

public class Employee implements Serializable {
int e_no;
String name;
float salary;
public Employee(int e_no, String name, float salary) {
	super();
	this.e_no = e_no;
	this.name = name;
	this.salary = salary;
}
public Employee() {
	// TODO Auto-generated constructor stub
}

void display( ) {
	System.out.println("Employee number : "+e_no+" Name : "+name+" Salary : "+salary);
}

void count(int i) {
	System.out.println("Number of employee fields are : "+i);
}



}
