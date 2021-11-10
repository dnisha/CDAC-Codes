package Nov_9;
import java.io.*;
import java.util.ArrayList;
import java.util.Iterator;
class Book implements Serializable
{
	String bname;
	int price;
	public Book(String bname, int price) {
		super();
		this.bname = bname;
		this.price = price;
	}
	@Override
	public String toString() {
		return "Book [bname=" + bname + ", price=" + price + "]";
	}
	
}

public class BookSolution 
{
	public static void main(String[] args) {
	try
	{
		Book b= new Book("java",2300);
	
	Book b1= new Book("c++",2300);
	Book b2= new Book("oracle",2300);
	Book b3= new Book("abc",2300);
	ArrayList<Book> l= new ArrayList<Book>();
	l.add(b);
	l.add(b1);
	l.add(b2);
	l.add(b3);
	//System.out.println(l);
	
	ObjectOutputStream o= new ObjectOutputStream (new FileOutputStream("test.ser",true));
	o.writeObject(l);	
	o.close();

	ObjectInputStream oi= new ObjectInputStream (new FileInputStream("test.ser"));
	ArrayList d;
	//do		{
		d=(ArrayList)oi.readObject();
  //		}while(d!=null);
	//System.out.println(d);
	Iterator s= d.iterator();
	Book w;
	while(s.hasNext())
	{
	w=(Book)  s.next();
	System.out.println(w);
	}}
	catch(Exception e) {
		System.out.println(e);
	}
	}

}
