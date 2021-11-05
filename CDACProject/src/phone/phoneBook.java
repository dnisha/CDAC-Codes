package phone;

import java.util.Scanner;

public class phoneBook {
	
	String name;
	int phone;
	String address;
	static int choice;
	
	public class personal extends phoneBook {
		String relation;
		
		void getInput() {
			Scanner sc = new Scanner(System.in);
			
			System.out.println("Enter name : ");
			name = sc.nextLine();
			
			System.out.println("Enter phone : ");
			phone = sc.nextInt();
			
			System.out.println("Enter address : ");
			address = sc.nextLine();
		
		
		}
		
	}

	
	
	public class Business{
		String organization;
		String dpt;
		int mobile;
		
		void accept() {
			
		}
		
		void show() {
			
		}
		
		
	}
	
	public class Accept extends personal{
		
		public static void main(String args[]) {
			System.out.println("Enter Choice ");
			Scanner sc = new Scanner(System.in);
			
			choice = sc.nextInt();
			
			
			
			switch(choice) {
			
			case 1:{
			
			
		
					
				
				
			}
			
			
			}
			
		}
	}
	
}






