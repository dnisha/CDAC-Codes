package Arrays;

import java.util.ArrayList;

import javax.xml.validation.Validator;

public class TargetVal {

	static 	ArrayList<Integer> list = new ArrayList<>();
static void Val(int arr[], int index,int target) {
	
		if(arr.length == index) {
			return ;
		}
		
		if (target == arr[index]) {
		
			list.add(index);
			
		}
		Val(arr, index+1,target);

			
		
	}

static ArrayList<Integer> Val1(int arr[], int index,int target,	ArrayList<Integer> list) {
	
	if(arr.length == index) {
		return list;
	}
	
	if (target == arr[index]) {
	
		list.add(index);
	}
	return Val2(arr, index+1,target);
	

		
	
}

static ArrayList<Integer> Val2(int arr[], int index,int target) {
	ArrayList<Integer> list2 = new ArrayList<>();
	if(arr.length == index) {
		return list2;
	}
	
	if (target == arr[index]) {
	list2.add(index);
		
		
	}
	ArrayList<Integer> list=	Val2(arr, index+1,target);
	list.addAll(list2);
	return list;

	
	

		
	
}

	public static void main(String[] args) {
		int arr[] = {3,2,1,18,15,18,197,5,1,5,7,3,7,2,7,77};
	
//		ArrayList<Integer> list1  =  Val1(arr,0,18,list);
		
		
		
		System.out.println(Val2(arr,0,7));
	}
}
