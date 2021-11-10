
public class ProgDefault {
	
	

	public static void main(String[] args) {
//		AndroidPhone  a = new AndroidPhone();
		Phone a = new AndroidPhone();
		a.call();
		a.Message();

	}

}
interface Phone{
	void call();
	default void Message() {
		 System.out.println("Messaging");
	}
}

class AndroidPhone implements Phone{

	@Override
	public void call() {
	 System.out.println("Calling");
	}
	
}