

public class binary {
	
	
	static int search(int arr [], int s,int e,int target) {
		
		if(s>e) {
			return -1;
		}
		
		int m = s+(e-s)/2;
		
		if(arr[m]>target) {
			return search(arr, s, m-1, target);
			
		}
		else if (arr[m] < target) {
			return search(arr, m+1, e, target);
		}
		else {
			return m;
		}
		
	}
	

	public static void main  (String argString []) {
		int arr [] = {1,2,3,4,5,6,7};
		int target = 100;
		
		System.out.print(search(arr,0,arr.length-1,target));
	
		
	}
}
