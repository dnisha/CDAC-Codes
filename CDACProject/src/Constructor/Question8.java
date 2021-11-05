package Constructor;

public class Question8 {
	
	int cube(int a) {
		return a*a*a;
	}
	
	float cube(float b) {
		return b*b*b;
	}
	

	public static void main(String[] args) {
		Question8 num = new Question8();
		
		
		int a=num.cube(3);
		System.out.println("Cube Integer "+a);
		
            float b = num.cube(0.2f);
            System.out.println("Cube Integer "+b);
	}

}
