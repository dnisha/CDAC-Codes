package ArrList;

import java.util.Collections;
import java.util.LinkedList;

public class LinkList {

	public static void main(String[] args) {
		
		Student s1 = new Student(1, "Deepak", 1555.2f);
		Student s2 = new Student(2, "rohan", 2000.2f);
		Student s3 = new Student(3, "poja", 3000.2f);
		Student s4 = new Student(4, "anil", 3000.2f);
		
		LinkedList<Student> l1 = new LinkedList<Student>();
		l1.add(s1);
		l1.add(s2);
		l1.add(s3);
		l1.add(s4);
		l1.clear();
		System.out.println(l1);
	


	}

}
