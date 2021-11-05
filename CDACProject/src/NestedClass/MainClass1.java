package NestedClass;

import java.util.Scanner;

import Interface.inter1;

class Bank{
	int accountno =123;
	String name = "Deepak";
	float balance = 12000.210f;
	
	static int bankifsc=12334;
	static String bankname="ICICI";
	
	class SavingAccount{
		int saving_interest ;
		
		void getData() {
			Scanner sc = new Scanner(System.in);
			System.out.print("Enter  bankname : ");
			
			bankname = sc.next();
			
		}
		
		void showData() {
			
			System.out.println(bankname);
		}
		
	}
	
	static class Banner{
		void show() {
			
			
			System.out.println(bankname);
			System.out.println(bankifsc);
			
		}
		
		void getData() {
			Scanner sc = new Scanner(System.in);
			
			
				
		}
		void showData() {
			
		}
		
	}
	
	
	
}

public class MainClass1 {

	public static void main(String[] args) {
		
		Bank. Banner b = new Bank.Banner();
		b.show();
		b.getData();
		b.showData();
		
		
		Bank b1 = new Bank();
		Bank.SavingAccount s = b1. new SavingAccount();
		s.getData();
		s.showData();
		
		
		
		
		
		
		
		

	}

}
