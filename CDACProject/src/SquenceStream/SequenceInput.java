package SquenceStream;
import java.io.*;

public class SequenceInput {

	public static void main(String[] args) throws IOException
	{
	 FileInputStream f1= new FileInputStream("f1.txt");
	 FileInputStream f2= new FileInputStream("f2.txt");
	 FileOutputStream f3= new FileOutputStream("f6.txt");
	 
		int i;
		SequenceInputStream s=new SequenceInputStream(f1,f2);
		do
		{
			
		i=s.read();
		if(i!=-1) {
		f3.write(i);
        System.out.print((char)i);
		}
			
		}while(i!=-1);
		
	}

}
