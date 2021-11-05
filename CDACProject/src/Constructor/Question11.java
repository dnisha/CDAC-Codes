package Constructor;

public class Question11 {
	
	int a;
	float b;
	int n;
	
	 Question11(){
		  n = 5;
	 }
	
	
	
	int pow(int a) {
		
		return n*a;
		
	}
	
float pow(float a) {
		
		return n*a;
		
	}

	public static void main(String[] args) {
		
		Question11 num1 = new Question11();
		Question11 num2 = new Question11();
		
		int a = num1.pow(6);
		
		System.out.println("Pow function with integer value : "+a);
		
		
		float b = num2.pow(5.255f);
		System.out.println("Pow function with integer value : "+b);
		
		
		

	}

}
