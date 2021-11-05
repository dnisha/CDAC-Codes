package Test;

public class Child extends Parents{
String name = "Inside Child";
	Child(){
		String name = "Inside Child const";
		System.out.println(name);
		System.out.println(this.name);
		System.out.println(super.name);
	}
	
	Child(int a){
		System.out.println("Argument Child called");
	}
	public static void main(String[] args) {
		
		Child c = new Child();
		
	}

}
