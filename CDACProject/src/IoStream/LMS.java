package IoStream;

import java.util.Scanner;
import java.io.*;

class bookoutputStream extends ObjectOutputStream
{

	public bookoutputStream(OutputStream out) throws IOException {
		super(out);
		// TODO Auto-generated constructor stub
	}
	protected void writeStreamHeader() {}
	
}
public class LMS {

	public static void main(String[] args) {
		try {
		String a,b;
		int c;
		Scanner s= new Scanner(System.in);
		System.out.println("enter bookname aname and price");
		a=s.nextLine();
		b=s.nextLine();
		c=s.nextInt();
		
		Book b1= new Book(a,c,b);
		
		File f= new File("Book.txt");
		FileOutputStream fo= new FileOutputStream(f,true);
		if(f.length()<=0)
		{
			ObjectOutputStream o= new ObjectOutputStream(fo);
			o.writeObject(b1);// calls write streamheader
			o.close();
		}
		else
		{
			bookoutputStream bs=new bookoutputStream(fo);
			bs.writeObject(b1);// it will call its own class write stream header
	 //and that is empty 
 	// means it will not write header if file already exists
		}		ObjectInputStream oi= new ObjectInputStream(new FileInputStream(f));
		do
		{
			b1=(Book)oi.readObject();
			b1.display();
		}while(b1!=null);
		}catch(Exception e) {}
	}

}
