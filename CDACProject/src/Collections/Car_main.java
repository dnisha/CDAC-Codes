package Collections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

import Interface.inter1;

public class Car_main {
	
	public static void main(String[] args) {
		
		int m;
		String n;
		float p;
		Scanner sc = new Scanner(System.in);
	
		
		Car []c  = new Car[5];	
		
		HashSet<Car> h = new HashSet<Car>();
		
		for(int i = 0 ;i<3;i++) {
			System.out.println("Enter , model,name , price ");
			m = sc.nextInt();
			n = sc.next();
		
	
			p = sc.nextFloat();
	        c[i]  = new Car(m,n,p);
	        h.add(c[i]);
		}
		
		
			System.out.println(h);
			
		
		

	}

}
