package Collections;
import java.util.*;

public class EmployeeList {

	public static void main(String[] args) {
		
EmployeeData e= new EmployeeData("rajan",22,"Noida");
EmployeeData e1= new EmployeeData("priya",22,"delhi");
EmployeeData e2= new EmployeeData("ashu",22,"meerut");
EmployeeData e3= new EmployeeData("gagan",22,"UP");
EmployeeData e4= new EmployeeData("amit",22,"Noida");
LinkedList<EmployeeData> l= new LinkedList<EmployeeData>();
l.add(e);
l.add(e1);
l.add(e2);
l.add(e3);
l.add(e4);

//EmployeeData e5= new EmployeeData("amit",22,"Noida");
System.out.println(l.peekLast());


	}

}
