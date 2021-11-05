package JavaIOBasic;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import Interface.inter1;

//import Interface.inter1;

public class Prog5 {


	public static void main(String[] args) throws IOException {
		
		InputStreamReader i = new InputStreamReader(System.in);
		
		BufferedReader br = new BufferedReader(i);
		char a ;
		
		try {
			 System.out.println("Enter Any Character");
		do {
	     
			
			a = (char) br.read();
			
			System.out.println(a);
			
		}while( a != 'q');
		

			
		
	
			
		
				
		
		} catch (Exception e) {
			System.out.println(e);
		}
	
	 
	   
	   
	}

}
