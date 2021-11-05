package Maths;

import Copy_Const.Test_this;
import Interface.inter1;

public class MathsOperations {
	public static int  a,b,c;

	public static void minimum() {
		
		if( a<b && a<c) {
			
			System.out.println("Minimum of Three is : "+a);
		}
		
		else if(b<a && b<c) {
			System.out.println("Minimum of Three is : "+b);
		}
		else {
			System.out.println("Minimum of Three is : "+c);
		}
	}
		
	
	
	public static void maximum() {
		
		if(a>b && a>c) {
			System.out.println("Maximum of Three is : "+a);
			
		}
		else if(b>a && b>c) {
			System.out.println("Maximum of Three is : "+b);
		}
		else {
			System.out.println("Maximum of Three is : "+c);
		}
		
	}

}
