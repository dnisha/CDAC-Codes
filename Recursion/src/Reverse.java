
public class Reverse {
	int rem;
	static int a=0; 
	void fun(int n) {
		
		if(n==0) {
			return ;
		}
		rem = n%10;
		a = 10*a+rem;
		
		fun(n/10);
	
		
	}

	public static void main(String[] args) {
	int n=123;
	Reverse r = new Reverse();
	r.fun(n);
	System.out.println(a);
	
	

	}

}
