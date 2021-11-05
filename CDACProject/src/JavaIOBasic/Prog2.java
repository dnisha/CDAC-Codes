package JavaIOBasic;

import java.io.File;

import Tut.Abcspace;

public class Prog2 {

	public static void main(String[] args) {
		
		File f = new File("abc.txt");
	System.out.println(f.length());
	System.out.println(f.lastModified());
	System.out.println(f.getName());
	System.out.println(f.getTotalSpace());
	System.out.println(f.getPath());
	System.out.println(f.getParent());
	System.out.println(f.getUsableSpace());

	}

}
