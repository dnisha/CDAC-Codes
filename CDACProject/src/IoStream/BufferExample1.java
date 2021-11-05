package IoStreamIoStream;

import java.io.*;

// wap to ask name ,age and salary of user using BufferedReader class
public class BufferExample1 {

	public static void main(String[] args) throws Exception 
	{
		String name;
		int age ;
		float salary;
		System.out.println("eneter name ,age and salary");
	//	InputStreamReader i= new InputStreamReader(System.in);
	//	BufferedReader b= new BufferedReader(i);
		
		
		BufferedReader b= new BufferedReader(new InputStreamReader(System.in));
			
		name  = b.readLine();
		age   = Integer.parseInt(b.readLine()); //convert string to int
		salary=Float.parseFloat(b.readLine());
		
		System.out.println( name+"  "+age+"  "+salary);
	}

}
