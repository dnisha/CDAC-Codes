package InheritanceForPractice;

import java.util.Scanner;

import Interface.inter1;

public class Truck extends Vehicle{

int wheels = 16;

	
	
	
	

	@Override
	void getData() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Truck Model : ");
		type = sc.next();
		
	
	
		System.out.println("Enter Cost of Vehicle : ");
		cost = sc.nextFloat();
		
		System.out.println("Enter Engine Power : ");
		enginPower = sc.next();
	}
	
	
	void showData() {
		System.out.println(type);
		System.out.println(speed+" km/hr");
		System.out.println(cost+" Rs");
		System.out.println(enginPower+" Hp");
		System.out.println(wheels+" Wheels");
	}

	@Override
	void setSpeed(int speed) 
	{
	
			this.speed = speed;
	
		
		}
		
		
	}




