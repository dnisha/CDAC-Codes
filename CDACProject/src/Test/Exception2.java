package Test;
//example for arrayIndexOutof bounds exception
public class Exception2 {

	public static void main(String[] args) {
		try {
		int x[]= new int[10];
		x[0]=222;
		x[2]=33;
		x[-11]=33;
		System.out.println(x[0]+""+x[2]+""+x[10]);
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
		 System.out.println("plz check array size");
		 System.out.println(e.getMessage());
		 
		 e.printStackTrace();
		 
		}
		System.out.println("after catch");
	}

}
