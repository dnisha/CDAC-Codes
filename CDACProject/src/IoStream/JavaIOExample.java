package IoStream;
import java.io.*;

//wap to read data from file and display it on console

public class JavaIOExample {

	
	
	public static void main(String[] args)throws IOException,FileNotFoundException
	{
    //eof =-1 
	
	//FileReader f= new FileReader("demo.txt");
	 FileInputStream f= new FileInputStream("demo.txt");
	//FileReader f= new FileReader("c:\\demo.txt");
	int i;
	do
		{
		i= f.read();
		 if(i!=-1)
			 System.out.print((char)i);
		}
	  while(i!=-1);
	  f.close();
	
	
	}

}
