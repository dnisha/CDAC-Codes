package Constructor;

public class Question10 {
	
	
	int min(int a, int b) {
		if(a<b) {
			return a;
		}
		else {
			return b;
		}
	}
	
	
	float min(float x, float y) {
		if(x<y) {
			return x;
		}
		else {
			return y;
		}
	}

	public static void main(String[] args) {
		Question10 num1 = new Question10();
		Question10 num2 = new Question10();
		
		int n1=num1.min(5, 10);
		
		float n2=num2.min(12.55f, 75.55f);
		
		System.out.println("Minimum in int is "+n1);
		System.out.println("Minimum in int is "+n2);
		
		
		

	}

}
