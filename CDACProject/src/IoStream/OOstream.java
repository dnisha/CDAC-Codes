package IoStream;
import java.io.*;

public class OOstream {

	public static void main(String[] args) throws Exception 
	{
		int i=44;
		
	String s="sneha";
	FileOutputStream f= new FileOutputStream("abc14.txt",true);
//	FileWriter fw= new FileWriter("aaa.txt");
	 
	ObjectOutputStream o= new ObjectOutputStream(f);
	//o.writeInt(i);
    o.writeObject(s);
    o.close();
       FileInputStream fi= new FileInputStream("abc14.txt");
 	ObjectInputStream oi= new ObjectInputStream(fi);
	String e;
	do
	{
 	e=(String)oi.readObject();
 	System.out.println(e);
	
	}while(e!=null);
    
    
	}

}
