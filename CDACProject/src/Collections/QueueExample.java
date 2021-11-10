package Collections;
import java.util.*;

public class QueueExample {

	public static void main(String[] args) {
		 
Queue r= new LinkedList(); //FIFO
r.add("neha");
r.add("ajay");
r.add("prashant");
r.add("priya");
System.out.println(r);
System.out.println(r.poll());//print and remove head element
System.out.println(r.poll());
System.out.println(r.peek());//print head element
System.out.println(r.remove());
//r.add("ena");
//System.out.println(r);



	}

}
