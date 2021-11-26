package Multithreading;

public class Pog1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

class Mythread extends Thread{
	
	String tname;
	int tp;
	@Override
	public void run() {
		
		System.out.println("Thread Name "+tname);
		System.out.println("Thread Priority "+tp);
	}
}