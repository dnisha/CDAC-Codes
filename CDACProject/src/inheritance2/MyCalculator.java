package inheritance2;

import Interface.inter1;
import Test.StaticDemo;

public class MyCalculator implements calc {
	
	
int a;
int b[]= new int[50];

	public static void main(String[] args) {
		
		MyCalculator c = new MyCalculator();
       int	a=	c. divisor(6);

     System.out.println(a);
		
		


}

	@Override
	public int divisor(int a) {
		int j=0;
		for(int i= 1;i <=a;i++) {
			
			if(a%i == 0) {
				b[j] = i;
				j++;
			}
		}
		
		int sum =0;
		for(int i= 0;i<b.length;i++) {
			sum += b[i];
		}
		
		return sum;
	}
	
	
	
}
	
