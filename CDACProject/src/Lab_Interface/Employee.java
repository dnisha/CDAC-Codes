package Lab_Interface;
import java.util.*;

public class Employee extends Person implements Person_data {
	String name;
	int d_num;
	String code;

	@Override
   void displayData() {
		System.out.println("Name of Employee : "+name);
		
		
		System.out.println("Department Number of Employee : "+d_num);
		
		System.out.println("Name of Employee : "+code);
		
		System.out.println("Name of Employee : "+password);
		}

	@Override
	void getData() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter name : ");
		name = sc.nextLine();
	
		System.out.println("Enter Department Number : ");
		d_num = sc.nextInt();
		
		System.out.println("Enter Department Code : ");
		code = sc.next();
		
		}

}
