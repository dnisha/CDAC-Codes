
public class Print_num {

	
	static void num(int n) {
	if(n ==0) {
		return ;
	}
	System.out.println(n +" ");
	  num(--n);

	}
	public static void main(String[] args) {
		
       num(5);
	}

}
