package Constructor;

public class Question6 {
	
	void sum(int a,int b,int c) {
		System.out.println("Sum Integer : "+(a+b+c));
	}
	void sum(int a,int b) {
		System.out.println("Sum Integer : "+(a+b));
	}

	public static void main(String[] args) {
		
		Question6 num = new Question6();
		
		num.sum(5, 10);
		
		num.sum(8, 5, 6);
		

	}

}
