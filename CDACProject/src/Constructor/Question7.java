package Constructor;

public class Question7 {
	
	int square(int a) {
		return a*a;
	}
	
	float square(float b) {
		return b*b;
	}

	public static void main(String[] args) {
	
		Question7 num = new Question7();
		
		int a = num.square(3);
		System.out.println("Integer Square :"+a);
		
		float b = num.square(0.2f);
		System.out.println("Float Square :"+b);

		
		

	}

}
