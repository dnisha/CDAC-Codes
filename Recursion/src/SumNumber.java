
public class SumNumber {
int mul=1;
	int fun(int a) {
		
		if(a==0) {
			return mul;
		}
		
		int rem = a%10;
		mul *=rem;
		a /=10;
		fun(a);
		return mul;
	}
	public static void main(String[] args) {
		int a =125;
		SumNumber s = new SumNumber();
		
	  System.out.println( s.fun(a));
		

	}

}
