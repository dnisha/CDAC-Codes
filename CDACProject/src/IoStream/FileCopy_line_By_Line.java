package IoStream;
import java.io.*;

//wap to read line from file using bufferedReader
import java.util.*;
public class FileCopy_line_By_Line {

	public static void main(String[] args) throws  Exception
	{
		BufferedReader r= new BufferedReader(new FileReader("Demo2.txt"));
		int a;
		 do {
			a = r.read();
			System.out.print((char)a);
		} while (a != -1);
		
		
		
		try
		  {
		Scanner  s= new Scanner (new FileReader("Demo2.txt"));
		String b;
		while( (b= s.nextLine())!=null)
		System.out.println(b);
		}
		catch(Exception e ) {}
		
		
			}

}
