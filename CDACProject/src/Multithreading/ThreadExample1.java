package Multithreading;

public class ThreadExample1 {

	public static void main(String[] args) {
		//Thread t= new Thread();
		Thread t= Thread.currentThread();
		
		System.out.println("welcome main");
		System.out.println(t.getName());
		System.out.println(t.isAlive());
		System.out.println(t.getPriority());
		t.setName("CDAC");
		t.setPriority(10);
		System.out.println(t.getName());
		System.out.println(t.isAlive());
		System.out.println(t.getPriority());
		System.out.println("welcome main");
		
	}

}
