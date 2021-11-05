package Constructor;
import java.util.Scanner;

class Record{
	int id,salary;
	String name;
	
public void getdata() {
	 Scanner sc = new Scanner (System.in);
	 
	 System.out.println("Enter the name of employee :  ");
	 name = sc.nextLine();
	 
	 System.out.println("Enter the id of employee :  ");
	 id = sc.nextInt();
	 
	 System.out.println("Enter the salary of employee :  ");
	 salary = sc.nextInt();
	 }
	public void disply() {
		
	}
	
}

public class Question5 {

	public static void main(String[] args) {
		
		Record r1 = new Record();
		r1.getdata();
		Record r2 = new Record();
		r2.getdata();
		Record r3 = new Record();
		r3.getdata();

	
		Record []student = new Record[3];
		int b[] = new int [3];
		student[0] = r1;
		student[1] = r2;
		student[2] = r3;
		
	
		
		System.out.println("id 1 :"+student[0].id);
		System.out.println("id 2 :"+student[1].id);
		System.out.println("id 3 :"+student[2].id);
		

	}

}
