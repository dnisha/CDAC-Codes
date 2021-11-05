package InheritanceForPractice;

import Interface.inter1;

public class Department extends Teacher implements College{
	int dpt_no;
	String dpt_name;
	public int getDpt_no() {
		return dpt_no;
	}
	public void setDpt_no(int dpt_no) {
		this.dpt_no = dpt_no;
	}
	public String getDpt_name() {
		return dpt_name;
	}
	public void setDpt_name(String dpt_name) {
		this.dpt_name = dpt_name;
	}
public void setName(String name) {
	this.name = name;
}
public String getName() {
	return name;
}

public void setQly(String qly) {
	this.qly = qly;
}

public String getQly() {
	return qly;
}

public String getC_name() {
return c_name;
}

	
	
	
public static void main (String [] args) {
	Department d=new Department();
	d.setName("Rohan");
	d.setQly("PHD in CS");
	d.setDpt_name("CSE");
	d.setDpt_no(2);
	
	System.out.println(d.getName());
	System.out.println(	d.getDpt_name());
	System.out.println(d.getDpt_no());
	System.out.println(d.getC_name());
	System.out.println(d.getQly());

	
}
	
	

}
