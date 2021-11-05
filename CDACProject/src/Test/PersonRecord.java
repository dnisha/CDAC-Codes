package Test;

import java.util.Scanner;

public class PersonRecord {
 String name;
 int aadharno;
 String address;
 void input()
 {
	 Scanner s= new Scanner(System.in);
	 System.out.println("enter name");
	 name=s.next();
	 aadharno=s.nextInt();
	 address=s.next();
}
void display()
{
	System.out.println(name+" "+aadharno +"  "+address);
}
}
