package Collections;
import java.util.*;

public class SetExample {

	public static void main(String[] args) {

		//LinkedList l= new LinkedList();//duplicate
		//unique record
		//TreeSet <String>s= new TreeSet<String>();//sort in ascending order
		//HashSet <String>s= new HashSet<String>();//hashcode
		 LinkedHashSet<String> s= new LinkedHashSet<String>();
		s.add("neha");
	    s.add("rajan");
	    s.add("anuj");
	    if(s.remove("rajan"))
	    {
	    	System.out.println(" record removed");
	    }
	    
	    s.add("abhay");
	    s.add("priya");
	    s.add("bina");
	    s.add("priya");
	    s.add("ritu");
	    s.remove("neha");
	  
	 
	    if(s.contains("bina"))
	    {
	    	System.out.println("record found");
	    }
	  
	  
	    System.out.println(s);
	    System.out.println(   s.hashCode());
		
		

		

	}

}
