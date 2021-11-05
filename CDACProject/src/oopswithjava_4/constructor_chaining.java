package oopswithjava_4;

public class constructor_chaining {
 int a;
 public constructor_chaining() {

  System.out.println("this is no argument constructor");
}
 public constructor_chaining(int x, int y) { }
 public constructor_chaining(int x, int y,int z) {
	 
 }
 public constructor_chaining(String f) { }
   
 public constructor_chaining(int x) 
 {
	  this(22,77);//same class no argument constructor is called
	  //must be the first statement in constructor
	  //in function we cannot call constructor using this 
	  a=x;
	  System.out.println(a);
	  this.a=300;
	  this.show();
	}
 void show()
 {   
	 //this();compile time error
	 new constructor_chaining();//ok  
	 System.out.println("inside show method");
 }
	public static void main(String[] args) {
	
		constructor_chaining c;
		c= new constructor_chaining(10);
		
	}

}
