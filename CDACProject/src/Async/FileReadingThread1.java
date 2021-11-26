package Async;
 
import java.io.*;

class fileread2
{
	String file;
	 
 static synchronized void reading(String file) 
	{
		 try 
	  {
		FileReader f= new FileReader(file);
		//FileInputStream f= new FileInputStream(file);
	    int y;
	    do
	    {
	    	y=f.read();
	    	System.out.print((char)y);
	 
	    	Thread.sleep(1000);
	    }while(y!=-1);
	}catch(Exception s) {}
	
	}
}

class filethread4 extends Thread
{
	fileread2 h;
	String file;
	filethread4(fileread2 h,String file)
	{
		this.h=h;
		this.file=file;
	}
	public void run()
	{ 
		try
		{
	       h.reading(file);
		}catch(Exception e) {}
	}
	
}



class filethread3 extends Thread
{
	fileread2 h;
	String file;
	
	filethread3(fileread2 h,String file)
	{
		this.h=h;
		this.file=file;
	}
	public void run()
	{ 
		try
		{
		  h.reading(file);
		}catch(Exception e11) {}
	}
	
}
public class FileReadingThread1 {

	public static void main(String[] args) throws InterruptedException {
		fileread2 o= new fileread2();
		fileread2 o1= new fileread2();
		 
		filethread4 f1= new filethread4(o,"Demo2.txt");
		filethread3 f2= new filethread3(o1,"demo1.txt");
		f1.start();
		//f1.join();
		f2.start();
        
        
	}

}
