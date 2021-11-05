package Test;

import java.util.Scanner;

public class Exception1 {

	public static void main(String[] args) {
     Scanner s= new Scanner(System.in);
     try
     { 
    	System.out.println("enter two numbers");
       	int x=s.nextInt();
    	int y=s.nextInt();
	    int c=x/y;
	    System.out.println("c="+c);
		int s1[]= new int[y];
     }catch(ArithmeticException r)
     {
    	 System.out.println("cannot divide zero");
     }
     catch(NegativeArraySizeException rr)
     {
    	 System.out.println("array size canot be negative");
     }
     catch(Exception t)
     {
    	 System.out.println("exception is super class ");
     }
     
     System.out.println(" after try catch");
     }

}
