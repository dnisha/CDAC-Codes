package collectiona_lab;

import java.util.Iterator;
import java.util.ListIterator;
import java.util.Vector;

import Interface.inter1;

public class Prog2 {

	public static void main(String[] args) {
		
		Vector<Integer> v = new Vector<Integer>();
		
	for(int i = 1;i<=40;i++) {
		if(i%2 ==0) {
			v.add(i);
		}
	
	}
	
	ListIterator<Integer> l = v.listIterator();
	
while(l.hasNext()) {
	
	System.out.println(l.next());
	
}

	}

}
