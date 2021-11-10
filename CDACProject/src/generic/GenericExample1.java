package generic;
class Addition<T>
{
	 T x;
	 T y;
	 
	Addition (T r,T q)
	{
	x=r;
	y=q;
	}
	T display()
	{
		 if (x == null || y == null) {
		        return null;
		    }

		    if (x instanceof Double) {
		        return (T) new Double(((Double) x) + ((Double)y));
		    } 
		    
		    else if (x instanceof Integer) {
		        return (T)new Integer((Integer)x +(Integer)y);
		    } 
		    else if (x instanceof Float) {
		        return (T)new Float((Float)x +(Float)y);
		    } 
		    else {
		        throw new IllegalArgumentException("Type " + x.getClass() + " is not supported by this method");
		    }
	}
}
public class GenericExample1 {

	public static void main(String[] args) {
		 
		Addition <Integer> a= new Addition(10,20);
		System.out.println(a.display());
		
		Addition <Double> b= new Addition(10.34,20.55);
		System.out.println(b.display());
		
		Addition<Float> c = new Addition(12.0f, 124.22f);
		System.out.println(c.display());

	}

}
