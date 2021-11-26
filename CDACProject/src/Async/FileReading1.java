package Async;

import java.io.FileReader;
import java.util.Scanner;

public class FileReading1 {

	public static void main(String[] args) {
		
		fileread2 o= new fileread2();
		 
		filethread4 f1= new filethread4(o,"Demo2.txt");
		filethread3 f2= new filethread3(o,"demo1.txt");
		f1.start();
		//f1.join();
		f2.start();
	
	}

}

class fileread2
{
	String file;
	
	synchronized    void reading(String file) 
		{
			 try 
		  {
	       Scanner s= new Scanner(new FileReader(file));

	     String m="";
	     do
		    {	 m = s.next();
	    
	    		
			    	System.out.print( "  "+m);
			    	Thread.sleep(500);
	    	 
		    
		    }while(m!=null);
		}catch(Exception s) {
			System.out.println(s.getMessage());
		}
		
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