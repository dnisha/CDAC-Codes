package ExceptionHandelingLab;

import java.util.concurrent.CountDownLatch;

public class Instance {
	static int count=0;
	public Instance() {
		count++;  
//		every time an Instance created static count variable is updated
	}

	public static void main(String[] args) {
		
		Instance i = new Instance();
		Instance i1 = new Instance();
		Instance i2 = new Instance();
		
//		System.out.println("Number of instance created = "+count);
		
		Instance i3 = new Instance();
		Instance i4 = new Instance();
		System.out.println("Number of instance created = "+count);
		
		
	}

}
