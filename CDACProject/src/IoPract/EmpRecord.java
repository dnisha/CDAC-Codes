package IoPract;

import java.io.File;
import java.io.FileInputStream;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.util.Scanner;

import Interface.inter1;

class Appendable1 extends ObjectOutputStream{

	protected Appendable1(OutputStream out) throws IOException, SecurityException {
		super(out);
		
	}
	
	@Override
	protected void writeStreamHeader()  {
	
	}
	
	
}

public class EmpRecord  {


	int e_no;
	String name;
	float salary;

	
	//Add Employee
	void write(Employee e1) throws IOException, ClassNotFoundException {
		File f = new File("emp.txt");
		FileOutputStream fo = new FileOutputStream(f,true);
		if(f.length() == 0) {

			
				ObjectOutputStream o;
				try {
					o = new ObjectOutputStream(fo);
					o.writeObject(e1);
				option();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
				
				
			}
			
			
		else {
			Appendable o1 = new Appendable(fo);
			o1.writeObject(e1);
			option();
			o1.close();
			fo.close();
		}
			
		
		}

	
	//Display Employee
	void read() throws ClassNotFoundException, IOException  {
		

		try {
			FileInputStream fi = new FileInputStream("emp.txt");
			ObjectInputStream o = new ObjectInputStream(fi);
			Employee x;
			do {
				 x= (Employee)o.readObject();

				x.display();
				System.out.println("_________________________________");
			
			} while (x != null);

			o.close();
			fi.close();
			
			
		} catch (IOException e) {
		
		}
		
	option();
		
	}
	
	
	//Get Employee data to add
	void getdata() throws IOException, ClassNotFoundException {
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter Employee no : ");
		e_no = s.nextInt();
		System.out.println("Enter Employee name : ");
		name=s.next();
		System.out.println("Enter Employee salary : ");
		salary=s.nextFloat();
		System.out.println("_________________________________");
		Employee e = new Employee(e_no, name, salary);
		write(e);
	}
	
	//count number of Employee
	void count() throws ClassNotFoundException, IOException {
		
		int e_count=0;
		try {
			FileInputStream fi = new FileInputStream("emp.txt");
			ObjectInputStream o = new ObjectInputStream(fi);
			Employee x;
			do {
				 x= (Employee)o.readObject();
				e_count++;
		
				x.count(e_count);
				System.out.println("_________________________________");
			
			} while (x != null);
			
		
			o.close();
			fi.close();
			
			
		} catch (IOException e) {
		
		}
		option();
	}
	
	//option
	void option() throws IOException, ClassNotFoundException {
			int option = 0;
		Scanner s = new Scanner(System.in);
		EmpRecord e1 = new EmpRecord();
		
		System.out.println("Option 1 to Add Employee");
		System.out.println("Option 2 to Display Employee");
		System.out.println("Option 3 to Count Employee");
		System.out.println("Option 4 to Search Employee");
		System.out.println("Option 5 to Delete Employee");
		System.out.println("Option 6 to Exit ");
		System.out.println("_________________________________");
		System.out.print("Choose one : ");
		option= s.nextInt();
		switch (option) {
		case 1:
	
				e1.getdata();
		
			break;
		case 2:

		
		
			    e1.read();
		
			break;
		case 3:
		e1.count();
			
			break;
		case 4:
			
			break;
		case 5:
			
			break;

		default:
	
			break;
			

		}
	
	}
	

	public static void main(String[] args) throws ClassNotFoundException, IOException {

		EmpRecord empRecord =new EmpRecord();
		empRecord.option();
	

	}

}
