package ExceptionHandelingLab;

import java.util.Scanner;

import Interface.inter1;

public class Circle extends Shape{
int r;
final float pi=3.14f;


public void setR() {
	 Scanner sc = new Scanner(System.in);
		System.out.println("Enter Radius of Circle ");
		
		this.r =sc.nextInt();
}

	public static void main(String[] args) {
	Circle c = new Circle();
	c.setR();

	System.out.println("Area "+c.area());
	System.out.println("Perimeter "+c.peremeter());
	}

	@Override
	float area() {
		float a = pi*this.r*this.r;
		return a;
	}

	@Override
	float peremeter() {
		
		return 2*pi*this.r;
	}

}
