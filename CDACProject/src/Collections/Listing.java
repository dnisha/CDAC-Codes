package Collections;
//collection framework 
//collection object work with class only 
//it does not work with primitive datatype 
import java.util.*;

public class Listing {

	public static void main(String[] args) {
  // array data must be similar type
		String name[]= {"neha","rajat"};
		
		//LinkedList l= new LinkedList();
		//l.add(22);
		//l.add(223.4f);
		LinkedList <Object>l= new LinkedList();
		l.add("neha");
		l.add(22);
		l.add("rajat");
		l.add("ashu");
		l.addFirst("yash");
		l.addLast("om");
		l.add(2,"jayant");
		l.addFirst("umesh");
		l.remove();
	
		System.out.println(l);
		//==============================
		
		LinkedList <Float>l2= new LinkedList<Float>();
		l2.add(45f);
		l2.add(22f);
		l2.remove();
	
		System.out.println(l2);
		
	
		
		
	}

}
