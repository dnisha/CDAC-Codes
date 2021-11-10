package patterns;

import java.util.Arrays;

public class pattern1 {
	
	static void triangle(int r,int c) {
		
		if(r == 0) {
			return;
		}
		
		if(c<r) {
			System.out.print("*");
			triangle(r, c+1);
		}
		else {
			System.out.println(" ");
			triangle(r-1, 0);
		}
		
	}
	
	static void triangle2(int r,int c) {
		
		if(r == 0) {
			return;
		}
		
		if(c<r) {
			triangle2(r, c+1);
			System.out.print("*");
		
		}
		else {
			triangle2(r-1, 0);
			System.out.println(" ");
	
		}
		
	}
	
	
static void bubble(int [] arr,int r,int c) {
		
		if(r == 0) {
			return;
		}
		
		if(c<r) {
			
			if(arr[c] > arr[c+1]) {
				
				int temp = arr[c];
				arr[c] = arr[c+1];
				arr[c+1] = temp;
			}
		
			bubble(arr, r, c+1);
		
		}
		else {
			bubble(arr, r-1, 0);
		}
		
	}


static void selectionSort(int [] arr,int max,int r,int c) {
	
	if(r == 0) {
		return;
	}
	
	if(c<r) {
		
		if(arr[c] > arr [max]) {
			selectionSort(arr, c, r, c);
		}
	
	}
	else {
	
	}
	
}


	public static void main(String[] args) {
		
//		triangle2(4, 0);
		
		int arr[] = {4,3,2,1};
		
		bubble(arr, arr.length-1, 0);
		
		System.out.println(Arrays.toString(arr));

	}

}
