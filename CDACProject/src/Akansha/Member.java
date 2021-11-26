package Akansha;
//5)create class Member that inherits library and have fields like memberid,membername,age,address.
//6) Define no argument constructor that overrides default values for all data members;
//7) override base class methods and give appropriate functioning 
//8) override toString method 
import java.io.*;
import java.util.*;
 public class Member implements Library,Serializable {
	 int mem_id;
	 String mem_name;
	 int age;
	 String addr;
	//default constructor
	 Member(){
		 mem_id = 111;
		 mem_name = "jain";
		 age=25;
		 addr="INDIA";
	 }
	 public void Add_Record() {
		 Scanner sc = new Scanner(System.in);
		 System.out.println("Enter Member ID");
		 mem_id = sc.nextInt();
		 System.out.println("Enter Member Name");
		 mem_name = sc.next();
		 System.out.println("Enter Member age");
		 age = sc.nextInt();
		 System.out.println("Enter Member Address");
		 addr = sc.next();
	 }
	public void Display_Record() {
		System.out.println("------Members Details--------");
		System.out.println("Member ID: "+mem_id);
		System.out.println("Member Name: "+mem_name);
		System.out.println("Member Age: "+age);
		System.out.println("Member Address: "+addr);	
	}
	public String toString() {
		return mem_id+" "+mem_name+" "+age+" addr";
	}
}
