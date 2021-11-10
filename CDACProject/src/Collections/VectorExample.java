package Collections;
import java.util.*;

public class VectorExample {

	public static void main(String[] args) {
LinkedList v= new LinkedList();  
v.add("ashu");

v.add("priya");
v.add("gagan");
v.add("neha");
ListIterator i= v.listIterator();
while(i.hasNext())
{
	System.out.println(i.next());
}

System.out.println("============================");
while(i.hasPrevious())
{
	System.out.println(i.previous());
}
	
	}

}
