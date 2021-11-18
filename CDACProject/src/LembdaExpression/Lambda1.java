package LembdaExpression;
//functional interface 
//has exactly one method
interface message
{  	String show(); 
}
interface addition
{  	int add(int x,int y); }

public class Lambda1 {

	public static void main(String[] args) {
		
	message m =	()->"hello";
	System.out.println(m.show());
	//can declare variable 
	//can have if  return 
	//generally used for short handline of code 
	addition g= (x,y)->
	      {
	    int e=22; 
		if(x>y)return x+y;
		else
			return 0;
		};	
	System.out.println(g.add(10,20));
	
	addition g1 = (x,y)-> x+y;	
	System.out.println(g1.add(11,22));
	}

}
