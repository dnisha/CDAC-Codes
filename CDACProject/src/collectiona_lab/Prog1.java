package collectiona_lab;

import java.util.ListIterator;
import java.util.Vector;

import Interface.inter1;

public class Prog1 {

	public static void main(String[] args) {
		
		Vector<String> v = new Vector<String>();
		
		v.add("Deepak");
		v.add("Rohan");
		v.add("Suresh");
		v.add("Raman");
		v.add("Aman");
		
		System.out.println(v);
		
		
		//Traversing Vector Elements
		System.out.println();
		System.out.println("Traversing Elements :");
		
		ListIterator<String> i = v.listIterator();
		while (i.hasNext()) {
			System.out.println(i.next());
			
		}
		
		
		//PrintingVector Object Hashcode
		System.out.println();
		System.out.println("Vector Obj Hashcode");
		System.out.println(v.hashCode());
		
        //Size of Vector
		System.out.println();
		System.out.println("Size Of Vector");
		System.out.println(v.size());
		
		
		
        //Capacity of Vector
		System.out.println();
		System.out.println("Capacity Of Vector");
		System.out.println(v.capacity());
		
		
		//Add null Data In Vector
	    v.add(null);
	
	//Index value of null element
	System.out.println();
	System.out.println("Index Of Null Obj");
	System.out.println(v.indexOf(null));

		//Adding element at index 2
	v.insertElementAt("Krutika", 2);
	
	//Remove element at 3
	v.removeElementAt(4);
	
	

	

		
	
	}
	

		
	

}
