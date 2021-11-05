package Project;
import java.util.*;

class Bank1 {
	
	String name,Acc_t;
	int Acc_n,Bal;
	
	Bank1(){
		
	}
	
   Bank1(int Acc_n,int Bal , String name,String Acc_t){
	   
	  
	   this.Acc_n = Acc_n;
	   this.Bal = Bal;
	   this.name = name;
	   this.Acc_t = Acc_t;
		
	}
   
  void  Display(){
	   System.out.println("The name of person is "+name+" Account number :"+Acc_n+" Having balance : "+Bal+" of Account Type : "+Acc_t);
   }
	
}

public class Bank {

	public static void main(String[] args) {
		
		Scanner sc =  new Scanner (System.in);
		
		 System.out.println("Enter the name :");
		String name = sc.nextLine();
		
		 System.out.println("Enter Account Number :");
		int Acc_n = sc.nextInt();
		
		 System.out.println("Enter Account Balance  :");
		int Bal = sc.nextInt();
		
		 System.out.println("Enter Account type  :");
		String type = sc.next();
		
		Bank1 p1 = new Bank1 (Acc_n,Bal,name,type);
		
		
		Bank1 p2 = new Bank1 (Acc_n,Bal,name,type);
		Bank1 p3 = new Bank1 (Acc_n,Bal,name,type);
		p1.Display();
		

	}

}
