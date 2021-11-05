package Day3;
import java.util.*;

public class Question4 {

	public static void main(String[] args) {
		
		
		int a [] = {1,2,3,4,5,6,7,8,9,10};
		
		int j=0;
		int even[] = new int[a.length];
		
		
		int odd[]= new int[a.length];
		int k=0;
		
		for(int i=0;i<10;i++) {
			if(a[i] %2 ==0) {
				even[j] =a[i];
				j++;
			
			}
			else {
				odd[k] = a[i];
				k++;
				
			}
		}
		System.out.println("Even array ");
		for(int i=0;i<j;i++) {
			System.out.print(even[i]+" ");
		}
		System.out.println();
		System.out.println( "Odd array ");
		for(int i=0;i<k;i++) {
			System.out.print(odd[i]+" ");
		}
		
		
	

	}

}
