
public class fact {
     
	static int fun(int a) {
		if(a==0) {
			return 0;
		}
		
		return a+fun(--a);
	}
	public static void main(String[] args) {
		
		System.out.println(fun(10000));
	}

}
