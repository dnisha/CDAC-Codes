package ExceptionHandelingLab;

public class Prog5 {

	public static void main(String[] args) {
		int a ,b;
		try {
		
		 a = Integer.parseInt(args[0])	;
		b = Integer.parseInt(args[1])	;
		System.out.println("Value of a passed through commandline = "+a);
		System.out.println("Value of b passed through commandline = "+b);
		}catch(Exception e) {
			System.out.println("Argument not passed ");
		}
		
}

}
