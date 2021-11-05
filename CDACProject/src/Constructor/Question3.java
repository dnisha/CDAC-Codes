package Constructor;
import java.util.Scanner;


class Customer{
	
	String name;
	int Acc_num;
	String Acc_type;
	int bal;
	
	
 public void getdata() {
	 Scanner sc = new Scanner (System.in);
	 
	 System.out.println("Enter the name of Customer : ");
	 name = sc.nextLine();
	 
	 System.out.println("Enter Account Number : ");
	 Acc_num = sc.nextInt();
	 
	 System.out.println("Enter Account Type : ");
	 Acc_type = sc.next();
	 
	 System.out.println("Enter Account Balance : ");
	 bal= sc.nextInt();
	 
	 
 }
 
 public void deposit() {
Scanner sc = new Scanner (System.in);
	 
	 System.out.println("Enter the amount you want to deposit in Rs: ");
	 int amount = sc.nextInt();
	 
	 bal +=amount;
 }
 
 public void withdraw() {
	 Scanner sc = new Scanner (System.in);
	 System.out.println("Enter Account you want to withdraw in Rs : ");
	 
	 int amount = sc.nextInt();
	 
	 if(bal >= amount) {
		 bal -=amount;
	 }
 }
 
 public void display() {
	 System.out.println( "Name : "+name+" Account Number :"+Acc_type+" Balance in Rs :"+bal);
 }
	
	
}

public class Question3 {

	public static void main(String[] args) {
		
		Customer c1 = new Customer();
		c1.getdata();
		c1.deposit();
		c1.withdraw();
		
	     Customer c2 = new Customer();
	     c2.getdata();
		c2.deposit();
		c2.withdraw();
		
		
		
		c1.display();
		c2.display();
		

	}

}
