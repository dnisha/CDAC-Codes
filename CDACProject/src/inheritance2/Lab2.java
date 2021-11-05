package inheritance2;

import Interface.inter1;

public class Lab2 {

	public static void main(String[] args) {
		
		int a[] = {17,19,21};
		
		int sum=0;
		for(int i=0;i<a.length;i++) {
			
			if(a[i]%2 == 0) {
				sum +=1;
				
			}
			
			else if(a[i] == 5) {
				sum +=5;
			}
			
			else {
				sum +=3;
			}
		}

		System.out.println(sum);
	}

}
