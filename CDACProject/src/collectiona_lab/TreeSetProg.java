package collectiona_lab;

import java.util.Comparator;
import java.util.TreeSet;

public class TreeSetProg implements Comparable<TreeSetProg> {
String color;

public TreeSetProg(String color) {
	this.color = color;
}

public String toString() {
	return color;
}

	public static void main(String[] args) {
		
		TreeSet<TreeSetProg> t = new TreeSet<TreeSetProg>();
		t.add(new TreeSetProg("Red"));
		t.add(new TreeSetProg("Green"));
		t.add(new TreeSetProg("Yellow"));
		t.add(new TreeSetProg("White"));

		System.out.println(t);
	}
	
	

	@Override
	public int compareTo(TreeSetProg o) {
	
		if (o.color == this.color) {
			return 0;
		}
		else if (o.color.length() > this.color.length()) {
			return 1;
		}
		return -1;
	}

}

