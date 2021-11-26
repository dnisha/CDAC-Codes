package Akansha;
//9)create another class LibraryRecord having main method .
//Define member class object and call its method.
//10) Define addToFile(Member m)that add member details to file.
//11) Define Member showFromFile()that display member details from file.
//In main ask 5 member details from user ,(object array) and store them in file "member.ser"
import java.util.*;
import java.io.*;
class Append extends ObjectOutputStream {
	protected Append(OutputStream out) throws IOException, SecurityException {
		super(out);
	}
	@Override
	protected void writeStreamHeader() throws IOException {}
}
public class Library_record {
	
	void addToFile(Member m1) {
		try {
		m1.Add_Record();
		FileOutputStream f1 = new FileOutputStream("Member.ser",true);	
		File ff = new File("Member.ser");
		int n = (int)ff.length();
		if(n<=0) {
			ObjectOutputStream o1 = new ObjectOutputStream(f1);
			o1.writeObject(m1);
			o1.close();
		}
		else {
			Append aa = new Append(f1);
			aa.writeObject(m1);
			aa.close();
		}
		f1.close();
		}catch(Exception e) {}
	}
	void showFromFile() {
		try {
			FileInputStream f2 = new FileInputStream("Member.ser");
			ObjectInputStream o2 = new ObjectInputStream(f2);
			Member m2;
			do {
				m2 = (Member)o2.readObject();
				m2.Display_Record();
			}while(m2!=null);
			f2.close();
			o2.close();
		}catch(Exception e) {}
	}
	public static void main(String[] args) {
		Member m[] = new Member[5];
		Library_record l = new Library_record();
		//object Array
		System.out.println("Enter 5 member records:");
//		Member m2 = new Member();
//		l.addToFile(m2);
		for(int i=0;i<3;i++) {
			m[i]=new Member();
			l.addToFile(m[i]);
		}
		Member mm = new Member();
		mm.printMessage();
		Library.printDetails();
		l.showFromFile();
		System.out.println("--end---");
	}

}
