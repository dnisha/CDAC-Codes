package Constructor;

public class Question9 {
	void fun() {
		
	}
	
int fun(int x) {
	return x;
		
	}
int fun(int x, int y) {
	return x+y;
}

	public static void main(String[] args) {
		
		Question9 num = new Question9();
		Question9 num2 = new Question9();
		
		int a=num.fun(10);
		System.out.println("Function one value :"+a);
		
		int b = num2.fun(10, 20);
		System.out.println("Function one value :"+b);
		
		
		
	}

}
