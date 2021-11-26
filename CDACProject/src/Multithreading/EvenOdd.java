package Multithreading;

import Interface.inter1;

public class EvenOdd {

	public static void main(String[] args) throws InterruptedException {
		

		
      Even even = new Even(10, 1);

    
      Thread t1 = new Thread(even);
      t1.join();
      
      Odd odd = new Odd(10,5);
      Thread t2 = new Thread(odd);
	}

}

class Even implements Runnable{
	int n;
	int priority;
	Thread t;
	
public Even(int n ,int priority){
	this.n = n;
	this.priority=priority;
	
	t = new Thread(this);
	t.setPriority(priority);
	
	t.start();

}
	@Override
	public void run( ) {

		for(int i = 0;i<=n;i++) {
			if ( i%2 == 0) {
				System.out.println(i+" is even number ");
				try {
					Thread.sleep(500);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			
		}
		
	}
	
}

class Odd implements Runnable{
	int n;
	int priority;
	Thread t;
	
public Odd(int n ,int priority){
	this.n = n;
	this.priority=priority;
	
	t = new Thread(this);
	t.setPriority(priority);
	
	t.start();

}
	@Override
	public void run( ) {

		for(int i = 0;i<=n;i++) {
			if ( i%2 != 0) {
				System.out.println(i+" is odd number ");
				try {
					Thread.sleep(500);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			
		}
		
	}
	
}