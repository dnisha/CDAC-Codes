package IoPract;
import java.io.Serializable;
import java.util.*;
//marker interface --> empty interface 
//object of student class will now be serilaized 
//its data can be written to file /network
// we are making class object as persistant --saved 
//without serilaization --> object is transient 

//state of object --> transient  persistent detached 

public class Student implements Serializable  
{

	String name;
	int age,marks;
    transient	String password;
	void input ()
	{
		Scanner s= new Scanner(System.in);
		System.out.println("enter name ");
		name= s.next();
		System.out.println("enter age");
		age=s.nextInt();
		System.out.println("enter marks");
        marks=s.nextInt();
	}
	void display()
	{
		System.out.println(name+"  "+age+"  "+marks);
	}
	
	static void countStudent(int i)
	{
		System.out.println("total students in file"+ i);
		
	}
}
