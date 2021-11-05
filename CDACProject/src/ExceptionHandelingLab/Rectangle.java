package ExceptionHandelingLab;

import java.util.Scanner;

import Interface.inter1;

public class Rectangle extends Shape{
	int l,b;
	


	public void setL() {
		 Scanner sc = new Scanner(System.in);
		System.out.println("Enter Lenght of Rectangle ");
		
		this.l =sc.nextInt();
	}



	public void setB() {
		 Scanner sc = new Scanner(System.in);
			System.out.println("Enter Lenght of Rectangle ");
			
			this.b =sc.nextInt();
	
	}

	public static void main(String[] args) {
	 
		Rectangle r = new Rectangle();
	
		r.setL();
		r.setB();
		
		System.out.println("Perimeter = "+r.peremeter());
		System.out.println("Area = "+r.area());
		

	}

	@Override
	float area() {
		
		return l*b;
	}

	@Override
	float peremeter() {
		// TODO Auto-generated method stub
		return 2*(l+b);
	}

}
