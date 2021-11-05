package JavaIOBasic;

import java.io.*;

import Interface.inter1;
public class Prog3 {

	public static void main(String[] args) throws IOException {
	
	File infile = new File("a1.txt");
	File ofile = new File("a2.txt");
	
	


FileInputStream r = new FileInputStream(infile);
FileOutputStream w = new FileOutputStream(ofile);



int i;

while((i= r.read()) != -1) {
	

	w.write((char)i);
	
}
w.close();
      System.out.println("Data Copied Sucessfully.......!! ");
   
      
   

}
}
