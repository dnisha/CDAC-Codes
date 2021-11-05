package ExceptionHandelingLab2;

import Interface.inter1;

public class Prog2 {

	public static void main(String[] args)  {
		
		int a = Integer.parseInt(args[0]);
		
		try {
			
			if(a < 0 || a>20 ) {
				throw new Exception();
			}
			
		} catch (Exception e) {
			System.out.println("Error Value is not Between 0 to 20 .............!");
		}
		
		
			System.out.println("Value of Argument is "+ a);
		
	

	}

}
