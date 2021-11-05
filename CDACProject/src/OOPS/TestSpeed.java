package oopswithjava_4;

public class TestSpeed {
void compare(Vehicle v,Vehicle v1)
{
if(v.speed>v1.speed)
		System.out.println("speed of first vehicle is greater");
else 
		System.out.println("speed of second  vehicle is greater");
}
	public static void main(String[] args) {
		Vehicle a=new Vehicle(190);
		Vehicle b=new Vehicle(230);
		TestSpeed t= new TestSpeed();
		t.compare(a, b);
		
	}

}
