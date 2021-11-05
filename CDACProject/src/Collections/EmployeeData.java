package Collections;

public class EmployeeData {

	String name;
	int age;
	String address;
	EmployeeData(String a,int b,String c)
	{
		this.name=a;
		this.age=b;
		this.address=c;
	}
	public String toString()
	{	return name+ " "+age+"  "+address;	}
	

}
