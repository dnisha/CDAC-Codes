package LibraryManagement;

import java.io.File;
import java.io.FileInputStream;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.util.ArrayList;

import Interface.inter1;

class Appendable extends ObjectOutputStream{

	protected Appendable(OutputStream out) throws IOException, SecurityException {
		super(out);
	
	}
	@Override
	protected void writeStreamHeader() throws IOException {
	
	}
	
}

public class LibraryRecord {
	File f = new File("member.txt");
	
	//ADDING REACORD TO FILE
	void addToFile(LibMember m1) throws IOException {
		FileOutputStream fo = new FileOutputStream(f,true);
		if(f.length() <= 0) {
			
			
			ObjectOutputStream o1 = new ObjectOutputStream(fo);
			
			o1.writeObject(m1);
			o1.close();
			fo.close();
		}
		else {
			Appendable o = new Appendable(fo);
			o.writeObject(m1);
			o.close();
			fo.close();
		
		}
	
	
		
	}
	
	//SHOWING RECORD FROM FILE
	void showFromFile() throws IOException, ClassNotFoundException {
		
		try {
			
			FileInputStream fi = new FileInputStream(f);
			ObjectInputStream o1 = new ObjectInputStream(fi);
			
			LibMember member;
			
			do {
				 member =	(LibMember) o1.readObject();
//					System.out.println(member);
					member.displayRecord();
				
			}while(member != null);
		   
			o1.close();
			fi.close();
			
		} catch (Exception e) {
		
		}
		

	}

	public static void main(String[] args) throws IOException, ClassNotFoundException {
	
		LibMember m1 = new LibMember();
		LibraryRecord r1 = new LibraryRecord();
		LibMember a[] = new LibMember[5];
		m1.printMessage();
		for(int i=0 ;i<5;i++) {
			a[i] = new LibMember();
		       a[i].addRecord();
			r1.addToFile(a[i]);
		}

		
	
//		m1.addRecord();
//		m1.displayRecord();
	
		r1.showFromFile();
	}

}
