package Constructor;




class construct3{
	   int a;
	    int b;
	    //constructor overloading
	    construct3()
	    {        a=1;         b=1;    }        
	    //parameterized constructor
	    construct3(int x,int y)
	    {         a=x;         b=y;    }
	    construct3(int s)    {
	        System.out.println("single argument");
	    }
}

public class Constructor {

	public static void main(String[] args) {
		
		
		
		  

		  
		        construct3 c= new construct3(22);
		        construct3 c1= new construct3();
		        construct3 c2= new construct3();
		        System.out.println(c.a +" "+ c.b); //1  1
		        System.out.println(c1.a +" "+ c1.b);// 1 1 
		        System.out.println(c2.a +" "+ c2.b); //1 1
		    construct3 k= new construct3(10,24);
		    System.out.println("k="+k.a+" "+k.b);
		    
	}

}
