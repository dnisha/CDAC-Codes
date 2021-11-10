package stack;

import java.util.LinkedList;


//comparing each element of one linked list with another Linked List
//and creating third linked list whjich will store yes if element are same
//no if elements are same 
public class LinkedListCompare {

	
	public static void main(String a[])
	{
	       LinkedList<String> c1= new LinkedList<String>();
	          c1.add("Red");
	          c1.add("Green");
	          c1.add("Black");
	          c1.add("White");
	          c1.add("Pink");
	          LinkedList<String> c2= new LinkedList<String>();
	          c2.add("Red");
	          c2.add("Green");
	          c2.add("Black");
	          c2.add("Orange");
	          //comparison output in linked list
	          LinkedList<String> c3 = new LinkedList<String>();
	          
	          
	          for (String e : c1)
	             c3.add(c2.contains(e) ? "Yes" : "No");
	          System.out.println(c3);         
	     }

	}
