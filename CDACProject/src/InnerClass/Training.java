package InnerClass;

import java.util.Scanner;

import Interface.inter1;

public class Training {
int s_id;
String name;
String address;
int phone;


class onlinetraining{
	
	void getdata() {
		System.out.println("You Chose online classes ");
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter name :");
		name=sc.next();
		
		System.out.println("Enter student id :");
		s_id=sc.nextInt();
		
		System.out.println("Enter student address :");
		address = sc.next();
		
		System.out.println("Enter student phone :");
		phone=sc.nextInt();
		
	}
	
	void showdata() {
		System.out.println("Name :"+name);
		
		System.out.println("Student Id :"+s_id);
		
		System.out.println("Address :"+address);
		
		System.out.println("Phone :"+phone);
		
	}
	
}

class offlinetraining{
	void getdata() {
		Scanner sc= new Scanner(System.in);
		
		System.out.println("You Chose offline classes ");
		System.out.println("Enter name :");
		name=sc.next();
		
		System.out.println("Enter student id :");
		s_id=sc.nextInt();
		
		System.out.println("Enter student address :");
		address = sc.next();
		
		System.out.println("Enter student phone :");
		phone=sc.nextInt();
		
	}
	
	void showdata() {
		System.out.println("Name :"+name);
		
		System.out.println("Student Id :"+s_id);
		
		System.out.println("Address :"+address);
		
		System.out.println("Phone :"+phone);
		
	}
	
}


	public static void main(String[] args) {
		int a;
		System.out.println("Enter 1 for Online or 2 for offline classes :");
		Scanner sc= new Scanner(System.in);
		a=sc.nextInt();
		
		if(a==1) {
			Training t = new Training();
			Training.onlinetraining i = t.new onlinetraining();
			
			i.getdata();
			i.showdata();
		}
		else {
			Training t = new Training();
			Training.offlinetraining i = t.new offlinetraining();
			
			i.getdata();
			i.showdata();
			
		}
				
				
		
	

	}

}
