package Async;
import java.io.*;

class fileread
{
	String file;
	fileread(String file)
	{
		this.file=file;
	}
	  void reading() 
	{try {
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

class filethread1 extends Thread
{
	
	
	public  void run()
	{fileread e1= new fileread("demo1.txt"); 
		try
		{
			
	        e1.reading();
		}catch(Exception e) {}
	}
	
}



class filethread2 extends Thread
{
	public void run()
	{fileread e= new fileread("Demo2.txt"); 
		try
		{
		  e.reading();
		}catch(Exception e11) {}
	}
	
}
public class FileReadingThread {

	public static void main(String[] args) throws InterruptedException {
		filethread1 f1= new filethread1();
		filethread2 f2= new filethread2();
		f1.start();
//		f1.join();
		f2.start();
        
        
	}

}
