package Static;



public class Question1 {

	Question1(int a,int b){
		System.out.println("Argument1 :- "+a+" Argument2:- "+b);
	}
	public static void main(String[] args) {
		
		System.out.println("Object one created :");
		Question1 num1 = new Question1(12 , 5);
		
		
		System.out.println("Object Two created :");
		Question1 num2 = new Question1(144 , 100);
		
		
		
		

	}

}
