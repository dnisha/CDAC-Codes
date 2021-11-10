package stack;

import java.util.Stack;

public class StackExample {

	public static void main(String[] args) {
		Stack <String> s= new Stack <String>();
		 
		System.out.println(s.push("ena"));
		System.out.println(s.add("amit"));

		s.add("neha");
		s.add("rajat");
		System.out.println(s);//print in insertion order 
		s.add("kamal");
		System.out.println(s.pop());//remove top element 
		System.out.println(s.peek());//print top element
		
		
		
			

	}

}
