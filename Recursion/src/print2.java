
public class print2 {

	static void fun(int a) {
		if(a==0) {
			return;
		}
		System.out.println(a);
		fun(a-1);
		System.out.println(a);
	}
	public static void main(String[] args) {
		
	fun(5);
	}

}
