package day7;

import java.util.Scanner;

//wap to ask name and age and salary of an
//employee from user 
//and display
public class Employee 
{//instance variable 
 String name;
 int age;
 float salary;
 
 void getData()
 {
 Scanner s= new Scanner(System.in);
 System.out.println("enter name age and salary");
 name=s.next();
 age=s.nextInt();
 salary=s.nextFloat();
 
 }
 void display()
 {
	 System.out.println(name);
	 System.out.println(age);
	 System.out.println(salary);
 }
 
 public static void main(String args[])
 {   //creating object of class employee using new 
	 Employee e= new Employee();
// e. functionname 
	 e.getData();
     e.display();
 }
	

}
