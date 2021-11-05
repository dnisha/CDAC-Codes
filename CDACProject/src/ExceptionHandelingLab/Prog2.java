package ExceptionHandelingLab;

import Interface.inter1;

public class Prog2 {
	String name;
	int age;
	String qualyfication;
	Float salary;
	Prog2(String name,int age,String qualyfication,	Float salary){
		this.name=name;
		this.age=age;
		this.qualyfication=qualyfication;
		this.salary=salary;
	}
	
	void getData() {
		System.out.println("Name : "+name);
		System.out.println("Age : "+age);
		System.out.println("Qualyfication : "+qualyfication);
		System.out.println("Salary : "+salary);
	}
	

	public static void main(String[] args) {
		
		Prog2 m1 = new Prog2("Rohan",25,"MCA",50000f);
		m1.getData();
		
	}

}
