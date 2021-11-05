package ArrList;

import java.util.Comparator;

import Interface.inter1;

public class Student  implements Comparator<Student> {
	int id;
	String name;
	float slry;
	
	  Student(int id,String name,float slry) {
		this.id = id;
		this.name = name;
		this.slry = slry;
	}
	  
	  public String toString() {
		return "[ id : "+id+" name : "+name+" salary "+slry+" ]";
		  
	  }


	public int compareTo(Student o) {
		if (this.slry > o.slry) {
			return -1;
		}
		else if (this.slry < o.slry) {
			return 1;
		}
		return 0;
	}

}
