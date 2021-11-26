package Async;

import Interface.inter1;

public class Pog1 {

	public static void main(String[] args) {
 int a=20;
		Even e = new Even (a);
		Odd o = new Odd(a);

		
		Thread t1 = new Thread(e);
		Thread t2 = new Thread(o);
		
		t1.start();
		t2.start();
	}

}

class Even extends Thread {

	int count;
	
	public Even(
	int count) {
		

		this.count = count;
	}
	
	public void run() {
		for(int i=0;i<=count;i++) {
			
			if(i%2 == 0) {
				System.out.println(i+" is Even number");
			}
		}
		
	}
}

class Odd extends Thread {

	int count;
	
	public Odd(
	int count) {
		

		this.count = count;
	}
	
	public void run() {
		for(int i=0;i<=count;i++) {
			
			if(i%2 != 0) {
				System.out.println(i+" is Odd number");
			}
		}
		
	}
}
