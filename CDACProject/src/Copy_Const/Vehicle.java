package Copy_Const;


class Test{
	Vehicle CompSpeed(Vehicle v1 , Vehicle v2) {
		if (v1.speed > v2.speed) {
			return v1;
		}
		else 
			return v2;
	}
	
}

public class Vehicle {
	
	int speed;
	
	Vehicle(int speed){
		this.speed = speed;
	}

	public static void main(String[] args) {
		
		Vehicle v1 = new Vehicle(100);
		
		Vehicle v2 = new Vehicle(300);
		
		Test_this t1 = new Test_this(50);
		
		
		Test t = new Test();
		
		Vehicle a = t.CompSpeed(v1, v2);
		
		
		
		
		if(a == v1) {
			System.out.println("v1 has greater speed");
		}
		else {
			System.out.println("v2 has greater speed ");
		}

	

}
