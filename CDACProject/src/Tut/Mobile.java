package Tut;

//print person name age and his mobile number 
public class Mobile {
     Person k; 
     
	int mobileno;
	
	
	
void show (Person p1,Mobile  m)
	{
	System.out.println(p1.name+" "+p1.age+m.mobileno);
	}

	
	public static void main(String[] args) {
	    Person p= new Person("amit",22);
		Mobile m= new Mobile();
		m.mobileno=9323423;
		m.show(p,m);	
	
	}
}
