package Tut_new;
//ever student has a address 
public class Student {

	String name;
	int rollno;
	Address add;
	Student ()	  {}
	Student(String n,int rollno,Address l)
	{
		name=n;
		this.rollno=rollno;
		this.add=l;
	}
     void display()
   {
    System.out.println(name);
    System.out.println(rollno);
    System.out.println(add.streetno);
    System.out.println(add.state);
   }
	public static void main(String[] args) {

    Address a= new Address(122,"delhi");
    Student s= new Student("neha",10,a);
   s.display();
	}

}
