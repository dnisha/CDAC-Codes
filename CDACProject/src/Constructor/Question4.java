package Constructor;



class StudentRecord{
	
	String name;
	int roll_no;
	
	StudentRecord(){
		name = "John";
		roll_no = 2;
	}
	
	public void display() {
		System.out.println("Name : "+name+" RollNumber : "+roll_no);
	}
	
}

public class Question4 {

	public static void main(String[] args) {
		
		StudentRecord s1 = new StudentRecord();
		s1.display();

	}

}
