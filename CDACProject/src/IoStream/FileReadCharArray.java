package IoStream;
import java.io.*;
//wap to read content of a file and store it in character array
 public class FileReadCharArray {

	public static void main(String[] args) throws IOException,FileNotFoundException
	{
		 FileReader f= new FileReader("demo.txt");
		 char r[]= new char[1000];
		  f.read(r);
		 System.out.println(r);

	}

}
