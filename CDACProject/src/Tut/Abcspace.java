package Tut;

public class Abcspace {

	public static void main(String[] args) {
		
		for(int i = 1 ; i<=4;i++) {
			int a=65;
			for(int j = 5; j>=i;j--) {
				System.out.print((char)(a));
				a++;
			}
			

			System.out.println();
		}

	}

}
