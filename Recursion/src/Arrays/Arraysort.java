package Arrays;
import javax.naming.ldap.SortControl;

public class Arraysort {
	static int Sort(int arr [],int i) {
		if(arr.length-1 == i) {
			return 1;
		}
		
		if(arr[i] < arr[i+1]) {
		return Sort(arr, i+1);
	}
		
		
		
	else {
		return -1;
	}
		
		
	
		
	}

	public static void main(String[] args) {
		
		int arr[] = {1,2,3,8,19,12};
		
	System.out.print(Sort(arr,0));
		

	}

}
