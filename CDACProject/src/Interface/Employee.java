package Interface;

import java.util.Scanner;

public class Employee extends Person implements inter1{
String name,address;
int deptno;

void getdata() {
	
	Scanner s= new Scanner(System.in);
	System.out.println("eneter name address and deptno");
	name=s.next();
	address=s.next();
	deptno=s.nextInt();
}
public void displaydata() {
	System.out.println(name);
	System.out.println(address);
	System.out.println(deptno);
	
}

}
