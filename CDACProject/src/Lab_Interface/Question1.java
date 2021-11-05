package Lab_Interface;

public class Question1 {
	
	Question1(){
		System.out.println("Object Created ");
	}
	
	public void finalize() {
		System.out.println("Object Destroyed");
	}

	public static void main(String[] args) {
		
		Question1 a = new Question1();
		Question1 b = new Question1();
		
//		a=null;
//		b=null;
		
		b =a;
		
		System.gc();
		
		
		

	}

}
