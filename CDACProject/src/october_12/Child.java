package october_12;

public class Child extends Parent
{

//	public Child()	{	  System.out.println("child constructor");	}

public Child(int x)
{   
	super(23);
	//explicitly call base class constructor
	System.out.println("child parameter");
}

	public static void main(String[] args) {
		
		//Grandparent g= new Grandparent(22);
		//Parent g= new Parent(22);
		Child c= new Child(22);
		
	}

}
