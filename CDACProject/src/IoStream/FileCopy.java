package IoStream;
import java.io.*;
public class FileCopy {

	public static void main(String[] args) throws IOException
	{    FileOutputStream o= new FileOutputStream("xyz.txt");

		FileInputStream f= new FileInputStream("Demo2.txt");
		int y;
		do
		{
		y=f.read();
		o.write(y);
		System.out.print((char)y);
		}while(y!=-1);

		


	}

}
