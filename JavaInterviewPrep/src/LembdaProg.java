
public class LembdaProg {

	public static void main(String[] args) {
	
A a;

a= (i)->
{
	System.out.println("Hello"+i);
};
	
a.Show(6);
	
	}
}

interface A{
	
	void Show(int i) ;
}