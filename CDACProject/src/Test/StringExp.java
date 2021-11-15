package Test;

public class StringExp {

	public static void main(String[] args) {
		String s1 =new String("Hello");
	String s3=	s1.concat("World");
		
		System.out.println(s3);
		
		
		StringBuffer s2 = new StringBuffer("Hello");
		s2.append(" "+"World");
		
		System.out.println(s2);
		
		StringBuilder s4 = new StringBuilder("Deepak");
		s4.append(" Nishad");
		
		System.out.println(s4);

	}

}
