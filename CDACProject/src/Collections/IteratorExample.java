package Collections;
import java.util.*;

public class IteratorExample {

	public static void main(String[] args) {
     
	 List <String>l= new LinkedList<String>();
     l.add("neha");
     l.add("amit");
     l.add("ashu");
     l.add("puja");
     l.add("gagan");
    // System.out.println(l);
     Iterator i= l.iterator();
     while(i.hasNext())
     {
    	 System.out.println(i.next().toString().toUpperCase());
     }

	}
	 
}
