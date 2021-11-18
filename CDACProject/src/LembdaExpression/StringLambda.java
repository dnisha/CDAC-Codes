package LembdaExpression;
interface Stringlength
{
	int getlength(String p);
}
public class StringLambda {

	public static void main(String[] args) {
		
		Stringlength a= (s)->s.length();
		
	 
		
  System.out.println( a.getlength("hello"));
  System.out.println( a.getlength("world"));
  System.out.println( a.getlength("abc"));
  System.out.println( a.getlength("rajan"));
  
	}

}
