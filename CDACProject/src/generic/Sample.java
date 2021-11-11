package generic;

import java.util.LinkedList;

import Interface.inter1;

public class Sample {

	public static void main(String[] args) {
	
	Sample1<Float> s = new Sample1<Float>();
	s.setData(125.2f);
	
//	System.out.println(s.data.getClass().getTypeName());
	
	System.out.println(s.getData());
	

	}

}

class Sample1<T>{
	
	T data;

	public T getData() {
		return data;
	}

	public void setData(T data) {
		this.data = data;
	}
	
}