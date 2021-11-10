package patterns;

import java.util.Iterator;

import javax.print.attribute.standard.Chromaticity;

public class Palindrom {

	public static void main(String[] args) {
		
		String string = "abcdcba";
		
		System.out.println(fun(string));
		

	}
	
	static boolean fun(String s) {
		s =s.toLowerCase();
		
		for(int i =0 ; i<s.length();i++) {
			
			char start = s.charAt(i);
			
			char end  = s.charAt(s.length()-1-i);
			
			if(end != start) {
				return false;
			}
			
			
			
		}
		return true;
	}

}
