package IoStream;
// wap to read first 10 character from file and store it in array


import java.io.*;

public class Fileexample2 {
	 
	public static void main(String[] args) throws IOException,FileNotFoundException
	{
		 FileReader f= new FileReader("demo.txt");
		 char r[]= new char[100];
		  f.read(r,4,30);
		 System.out.println(r);

	}

}
