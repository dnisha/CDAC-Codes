package Static;
import java.util.Scanner;

public class Employee {
	int sal;
	float work_hr;
	
	public void  getInfo(){
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Enter Salary of Employee :");
		this.sal = sc.nextInt();
		
		System.out.println("Enter working Hour of Employee :");
		this.work_hr = sc.nextFloat();
		
	}
	
	public void AddSal() {
		if(this.sal < 50000) {
			this.sal +=10000;
			
			System.out.println("New Salary of Employee :"+sal);
		}
		
	}
	
	public void AddWork() {
		if(this.work_hr >6) {
			this.sal += 5000;
			
			System.out.println("New Salary of Employee :"+sal);
		}
	}

	public static void main(String[] args) {
		
		Employee e1 = new Employee();
		e1.getInfo();
		e1.AddSal();
		e1.AddWork();

	}

}
