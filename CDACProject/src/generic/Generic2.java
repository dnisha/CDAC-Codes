package generic;


class Test<U>
{
	U a;
	void setA(U z)	{		a=z;	    }
	U getA()	    {		return a;	}
}
public class Generic2 {
	public static void main(String[] args) {

		Test <Integer> t= new Test<Integer>();
		t.setA(123);
		Test <String> r= new Test<String>();
		r.setA("rajat");
		System.out.println(" a="+t.getA());
		System.out.println(" a="+r.getA());
	}
}
