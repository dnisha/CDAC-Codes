package StringLabAssignment;

import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.PriorityQueue;
import java.util.Scanner;

import Copy_Const.Test_this;
import Interface.inter1;

public class Prog3 {
static	int i;
static String s;
	
static	void getString(){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number of String you want to Print : ");
		i = sc.nextInt();
		
		PriorityQueue<String> s1 = new PriorityQueue<String>(new MyCompare());
		
		for(int j=1; j<=i;j++) {
			System.out.println("Enter String "+j+" : ");
			s=sc.next();
			s1.add(s);
			
		}
		displayString(s1);
		
	}

static void displayString(PriorityQueue<String> s1) {
	
	
	
	System.out.println("Words in Lexical Order are : ");
	
	Iterator<String> i = s1.iterator();
	
	
	for (String string : s1) {
		System.out.println(string);
	}
}


	public static void main(String[] args) {
		getString();
		
	

	}

}

class MyCompare implements Comparator<String>{

	@Override
	public int compare(String o1, String o2) {

	if(o1.compareToIgnoreCase(o2) > 0) {
		return 1;
	}
	else if(o1.compareToIgnoreCase(o2) < 0){
		return -1;
	}

		return 0;
	}
}
