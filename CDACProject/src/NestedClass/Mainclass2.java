package NestedClass;
class vehicle
{ 
	int p=10;
    static int w=22;
	class car
	{
	int u=22;
	void show() {
		p=1000;//accessing outer class variable
		w=2222;
	}
	//static int g=33;
	}
	 static class record1
	 {
	 int i=10;
	 static int j=33;
	 
	 }
	
}
public class Mainclass2 {

	public static void main(String[] args) {
	
		vehicle  v= new vehicle();
		vehicle.car c= v.new car();
		c.u=100;
	
		
		//calling static variables
		vehicle.record1 r= new vehicle.record1();
		r.i=33;
		
	}

}
