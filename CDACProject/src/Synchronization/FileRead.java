package Synchronization;


import java.io.BufferedReader;

import java.io.FileReader;
import java.io.IOException;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane;


public class FileRead {
	
	public void fileread() throws IOException {
		
		FileReader fr = new FileReader("one.txt");
		
	
	
		
		do {
			
		
             try {
           	  int a= fr.read();
              System.out.print((char)a);
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
           
		}while(fr.read() != -1);
	}
	

	public static void main(String[] args) throws IOException {
	FileRead f1 = new FileRead();
	f1.fileread();

	}

}
