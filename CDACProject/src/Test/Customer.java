package Test;

import java.util.Scanner;

public class Customer extends PersonRecord 
{
    String custID;
    void get()
    {
     Scanner s= new Scanner(System.in);
   	 System.out.println("enter customerID");
   	 custID=s.next();
 	  input();	 
    }
    
    void print()
    {
    	System.out.println("Customet ID"+custID);
    	 display();
    	
    }
	public static void main(String[] args) {

		Customer c= new Customer();
		c.get();
		System.out.println("Print func");
		c.print();
		
	}

}
