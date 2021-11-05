package Exception_Handeling;

public class Exception_throws {

	static void show() throws ArithmeticException
	{  
	//try {
		int y=10;
		if(y==10)
			throw new ArithmeticException();
	//}catch(Exception e) {	System.out.println(" number cannot be 10 ");	}
	}
	
	static void display(int y)throws Exception
	{
		if(y%2!=0)
			throw new Exception();//checked
	}
	public static void main(String[] args)
	{
		try		{ 
			display(22);
		
		}catch(Exception r) {}
	}

}

