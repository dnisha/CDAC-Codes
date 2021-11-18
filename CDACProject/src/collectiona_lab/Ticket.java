package collectiona_lab;

import java.util.Comparator;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.PriorityQueue;

import Interface.inter1;

public class Ticket {
	int priority;
	int id;
	String issue;
	
	public Ticket(int priority,int id,String issue) {
		this.id = id;
		this.priority = priority;
		this.issue = issue;
	}
public String toString() {
	return "Ticket id :"+id+" Ticket Priority "+priority+" Ticket Issue : "+issue;
}

	public static void main(String[] args) {
MyCompare m = new MyCompare();
		PriorityQueue<Ticket> t1 = new PriorityQueue<Ticket>(m);
		
		t1.add(new Ticket(1,101,"Payment Stuck"));
		t1.add(new Ticket(4,105,"No payment"));
		t1.add(new Ticket(2,106,"Ticket Stuck"));
		t1.add(new Ticket(3,108,"Payment Fail"));
		
		
		System.out.println(t1);
		System.out.println(		t1.poll());
		System.out.println(		t1.poll());
		System.out.println(		t1.poll());
		System.out.println(		t1.poll());

	
	
}
}

class MyCompare implements Comparator<Ticket>{

	@Override
	public int compare(Ticket o1, Ticket o2) {
		
		return o1.priority-o2.priority;
	}
	
}

