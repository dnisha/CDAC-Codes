package ExceptionHandelingLab;

import java.util.Scanner;

public class Teacher extends Department implements College {
	String name;
    String Qualifycation;
    
    void displayData() {
    	System.out.println("Name : "+name);
    	System.out.println("Qualyfication : "+name);
    	System.out.println("College Name : "+c_name);
    	System.out.println("Department Number : "+dpt_n);
    	System.out.println("Department Name : "+dpt_name);
    }
    void getDtata() {
    	Scanner sc = new Scanner(System.in);
    	System.out.println("Enter Name : ");
    	name = sc.next();
    	
    	System.out.println("Enter Qualyfication : ");
    	Qualifycation = sc.next();
    	
    System.out.println("Enter Department Name : ");
    dpt_name = sc.next();
    
    try {
    	 System.out.println("Enter Department Number : ");
    	    dpt_n = sc.nextInt();
    	    
    	    if(dpt_n == 10 ||dpt_n == 20 || dpt_n == 30) {
    	    	  displayData();
   	    	   
    	    	
    	    }
    	    else {
    	    	throw new NoDepartmentException();
    	    }
	} catch (Exception e) {
		
	}
  
    	
    }
    
    public static void main(String args[]) {
    	Teacher t = new Teacher();
    	t.getDtata();
    	
    }
	

}
