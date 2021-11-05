package Constructor;

class value{
	int a;
	
	value(){
		a = 0;
	}
	
	value(int a){
		this.a =a;
	}
	
	public void display(){
		System.out.println("Value : "+a);
	}
	
}
public class Question12 {

	public static void main(String[] args) {
		
//		object with no argument
		value v1 = new value();
		
//		object with one argument
		value v2 = new value(10);
		
		v1.display();
		v2.display();
		
		
		
		
	}

}
