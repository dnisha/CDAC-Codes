package LibraryManagement;

import java.io.Serializable;
import java.util.Scanner;

import Interface.inter1;

public class LibMember implements Library,Serializable{
	int memberid,age;
	String membername,address;
	

	public LibMember() {
		super();
		this.memberid = 1;
		this.age = 20;
		this.membername = "Random";
		this.address = "Sacred Knowledge";
	}


	@Override
	public void addRecord() {
		Scanner sc = new Scanner(System.in);
		System.out.println("____________Enter new Member Details____________");
		System.out.println("Enter Member id : ");
		memberid = sc.nextInt();
		
		System.out.println("Enter Member name : ");
		membername = sc.next();
		
		System.out.println("Enter Member age : ");
		age = sc.nextInt();
		
		System.out.println("Enter Member address : ");
		address = sc.next();
		
	}

	@Override
	public void displayRecord() {
		System.out.println("-----Member Details-----");
		System.out.println("Member id : "+memberid);
		System.out.println("Member name : "+membername);
		System.out.println("Member age : "+age);
		System.out.println("Member address : "+address);
		
	}
	
	@Override
	public String toString() {
		
		return "Memberid : "+memberid+" Age :"+age+" Membername "+membername+" Address "+address;
	}

}
