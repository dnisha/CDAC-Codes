package singleton;
//singleton design pattern 
// class constructor is private 
//same class object is created in class using static 
//we create static method to return above object 
//outside class we cannot make object of this class

class Driver
{   static  Driver d= new Driver();
	private Driver()	{}
	//factory method -- methods that return references 
	static Driver getDriver()
	{
		return d;
	}
	void print()
	{
		System.out.println("this is a singleton class");
	}
	
}
public class Singleton {

	public static void main(String[] args) {
	
		//Driver d= new Driver(); //error
		Driver y= Driver.getDriver();
		Driver z= Driver.getDriver();
		Driver x= Driver.getDriver();
		y.print();
	
		System.out.println(x);
		System.out.println(y);
		System.out.println(z);

	}

}
