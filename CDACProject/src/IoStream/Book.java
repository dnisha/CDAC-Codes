package IoStream;
import java.io.*;

public class Book implements Serializable {
 String bname;
 int price;
 String aname;
 Book(String b,int a,String c)
 {
	 bname=b;
	 price=a;
	 aname=c;
	 
 }
 void display()
 {
	 System.out.println(bname);
	 System.out.println("  "+price);
	 System.out.println("  "+aname);
	 
 }
}
