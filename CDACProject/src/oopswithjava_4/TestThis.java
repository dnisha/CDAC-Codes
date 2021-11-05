package oopswithjava_4;

public class TestThis {

	int speed;
	TestThis(int u)
	{	speed=u;
		
	}
     void compare(Vehicle g)
     {
    	 if(speed>g.speed) 
    		 System.out.println("TestSpeed is higehr");
    	 else 
    		 System.out.println("Oh vehicle 2 wins ");
     }
	public static void main(String[] args) {
		Vehicle a=new Vehicle(130);
		TestThis t= new TestThis(239);
		t.compare(a);
		
		
		
		
		
		//TestThis t= new TestThis(230);
		//t.compare(a);
	}

}
