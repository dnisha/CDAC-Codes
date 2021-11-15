import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Iterator;

public class Handeling {

	public static void main(String[] args) throws IOException {
		
		File file = new File("D:\\FileHandling\\Example1.txt");
		
		FileOutputStream fO = new FileOutputStream(file,true);
		String aString = "DEEPAK Nishad";
		String b= aString.toLowerCase();
		
		char [] a = b.toCharArray();
		
		ObjectOutputStream ou = new ObjectOutputStream(fO);
		
		for(int i =0;i<b.length();i++) {
	ou.write(a[i]);
//	System.out.println(a[i]);
		}
		ou.close();
				
		
		FileInputStream fi = new FileInputStream(file);
		
		ObjectInputStream oi = new ObjectInputStream(fi);
		

		int a1 = oi.read() ;
	
			
		do {
			if (a1 != -1 ) {
				System.out.println((char)a1);
				a1 = oi.read();
			
			}
			
		} while (a1 != -1);
		
		
		
		oi.close();
		
	
				
			


	}

}

