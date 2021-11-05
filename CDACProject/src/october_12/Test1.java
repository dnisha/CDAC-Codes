package october_12;

public class Test1 {
	String name="neha";
	
	//overriding built in function of Object class 
	//@Override ->annotation 
	public String toString()
	{
		return name;
	}
	void display() {}
	public static void main(String[] args) {
		Test1 t= new Test1();
		
		System.out.println(t);//calling toString
    //in case if we donot override
	//tostring then it will print 
	//hashcode value of object
	}
	


}
