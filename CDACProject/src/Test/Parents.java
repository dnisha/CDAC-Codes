package Test;

public class Parents extends Grandparents{
	String name = "Inside parent";
	Parents(){
		System.out.println("No argument Parents called");
	}

	
	Parents(int a){
		System.out.println("Argument Parents called");
	}
}
