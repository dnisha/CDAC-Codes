package Async;
 

import java.io.*;
import java.util.*;
class readword
{
	String file;
	 
   void reading(String file) 
	{
		 try 
	  {
       Scanner s= new Scanner(new FileReader(file));

     String m="";
     do
	    {
	    	m=s.next();

	    		
		    	System.out.print( "  "+m);
		    	Thread.sleep(1000);
	
	    
	    }while(m!=null);
	}catch(Exception s) {
		System.out.println(s.getMessage());
	}
	
	}
}


class FileReadingWord 
{
	public static void main(String a[])
	{
		
		readword r= new readword();
		r.reading("Demo2.txt");
	}
}
