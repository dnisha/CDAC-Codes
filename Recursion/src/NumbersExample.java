import javax.sound.midi.Soundbank;

public class NumbersExample {

	  static void print1(int n) {
		
//		if(n==800) {
//			return;
//		}
		System.out.println(n);
		print1(++n);
	}

	
public static void main (String argString [] )  {
	
	print1(1);
	
}



}
