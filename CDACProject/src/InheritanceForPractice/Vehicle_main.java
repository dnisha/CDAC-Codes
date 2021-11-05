package InheritanceForPractice;

import java.util.Scanner;

import Copy_Const.Test_this;
import Interface.inter1;

public class Vehicle_main {

	public static void main(String[] args) {
		int type_v,speed_chk;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Type of Vehicle");
		System.out.println("Enter 1 for Truck or 2 for Submerine ");
		type_v = sc.nextInt();
		System.out.println("Enter speed Limit ");
		speed_chk = sc.nextInt();

		
		switch (type_v) {
		case 1: {
			Truck t= new Truck();
			t.getData();
			
			System.out.println("Enter Speed of Vehicle : ");
			int s  = sc.nextInt();
			try {
				if(s > speed_chk) {
					throw new SpeedException();
				}
				}
				catch (SpeedException e) {
					System.out.println("Vehical over speed .......!!!! ");
				}
			
		
			
			t.setSpeed(s);
			t.showData();
			
		}
		
		case 2: {
			Submarines s1= new Submarines();
			s1.getData();
			System.out.println("Enter Speed of Vehicle : ");
		    int s2 = sc.nextInt();
			try {
				if(s2 > speed_chk) {
					throw new SpeedException();
				}
				}
				catch (SpeedException e1) {
					System.out.println("Submarine over speed .......!!!! ");
				}
			
			
			  s1.setSpeed(s2);
			  s1.showData();
		}
		
		}
		

		
		
		
		
		
	
	}

}
