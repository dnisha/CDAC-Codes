package Async;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.channels.NonWritableChannelException;
import java.security.DrbgParameters;

import Interface.inter1;

public class Prog2 {

	public static void main(String[] args) {
		
CharRead1 read1 = new CharRead1();
CharRead2 read2 = new CharRead2();

Thread t1 = new Thread(read1);
Thread t2 = new Thread(read2);

t1.start();
t2.start();
	
	}

}

class ObjRead{
static	String file;

public ObjRead(String file) {
		this.file = file;
}

static synchronized void reading(){
	{try {
		FileReader f= new FileReader(file);
	
	    int y;
	    do
	    {
	      	y=f.read();
	    	if(y != -1) {
		    	System.out.print((char)y);
		    	Thread.sleep(25);
	    	}
	  

	    }while(y!=-1);
	}catch(Exception s) {}
	
}
}
	

}
class CharRead1 extends Thread{

	
	public void run() {
ObjRead o = new ObjRead("f1.txt");
o.reading();


	}
	
}

class CharRead2 extends Thread{

	
	public void run() {
ObjRead o1 = new ObjRead("f2.txt");
o1.reading();


	}
	
}




