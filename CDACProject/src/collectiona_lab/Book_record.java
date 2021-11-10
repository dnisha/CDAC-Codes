package collectiona_lab;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;

import Interface.inter1;

public class Book_record implements Serializable{
	int b_id;
	String name;
	float price;
	
	public  Book_record(int b_id,String name,float d ) {
		this.b_id = b_id;
		this.name = name;
		this.price = d;
		

		}
	 public String toString() {
			return "book id :"+b_id+" Book name : "+name+" Book Price :"+price;
	}
	
  public static void main(String args[]) throws FileNotFoundException, IOException, ClassNotFoundException {
	  
	  ArrayList<Book_record> a = new ArrayList<Book_record>();
	  a.add(new Book_record(1,"The Great Gatsby",1200.0f));
	  a.add(new Book_record(2,"One Hundred Years of Solitude",1300.0f));

	  a.add(new Book_record(3,"A Passage to India",200.0f));

	  a.add(new Book_record(4,"Invisible Man",1500.0f));
	  
//	  System.out.println(a);
	  
	  ObjectOutputStream o = new ObjectOutputStream(new FileOutputStream("Books.txt",true));
	  o.writeObject(a);
	  o.close();
	  
	  
	  ObjectInputStream i = new ObjectInputStream(new FileInputStream("Books.txt"));
	  
	 ArrayList<Book_record> a1;
	 
	 a1=(ArrayList<Book_record>)i.readObject();
	 
	 Iterator<Book_record> I = a1.iterator();
	 
	 Book_record b;
	 
	 
	 try {
		 
		 while(I.hasNext()) {
				b = I.next();
				System.out.println(b.name);
			 }
		
	} catch (Exception e) {
	System.out.println(e.getStackTrace());
	}


	  
  }

}
