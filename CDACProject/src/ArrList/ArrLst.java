package ArrList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Scanner;


import Interface.inter1;

public class ArrLst {

	public static void main(String[] args) {
		ArrayList<Student> l1 = new ArrayList<Student>();
		Student s[] = new Student[2];
		
//	for(int i =0;i<s.length;i++) {
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter id: ");
//		int id = sc.nextInt();
//		
//		System.out.println("Enter Name: ");
//		String name = sc.next();
//		
//		System.out.println("Enter Salary: ");
//		float slry = sc.nextFloat();
//		Student student = new Student(id , name, slry);
//		l1.add(student);
//		
//	}
		
		Student s1 = new Student(1, "Deepak", 1555.2f);
		Student s2 = new Student(2, "rohan", 2000.2f);
		Student s3 = new Student(3, "poja", 3000.2f);
		Student s4 = new Student(4, "anil", 3000.2f);
		
		l1.add(s1);
		l1.add(s2);
		l1.add(s3);
		l1.add(s4);
		
	Collections.sort(l1, new SortByNameThenMarks());
		
		System.out.println(l1);

//	System.out.println("List Full ");
//Iterator<Student> itr = l1.iterator();
//
//while (itr.hasNext()) {
//	System.out.println(itr.next());
//	
//}

//System.out.println(itr.next());
//System.out.println(itr.next());
//System.out.println(l1);


	}

}

class SortByNameThenMarks implements Comparator<Student>{

	@Override
	public int compare(Student o1, Student o2) {
	 if (o1.name.equals(o2.name)) {
		return (int) (o1.slry - o2.slry);
	}
	 else {
		 return o1.name.compareTo(o2.name);
		
	}

	}
	
}
