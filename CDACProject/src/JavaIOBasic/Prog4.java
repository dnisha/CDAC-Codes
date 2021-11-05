package JavaIOBasic;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Prog4 {

	public static void main(String[] args) throws IOException {
		

		File f = new File("abc.txt");
		
		FileInputStream fi = new FileInputStream(f);
		
		int count=0;
		int i;
		do {
			i = fi.read();
			if(i != -1) {
				count++;
			}
			
		} while (i != -1);
		System.out.print(count);

	}

}
