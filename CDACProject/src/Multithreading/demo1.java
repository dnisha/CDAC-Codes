package Multithreading;

public class demo1 {

	public static void main(String[] args) throws InterruptedException {
		
Thread t1 = new Thread(() ->{
			for(int i=0 ; i<5;i++) {
				System.out.println("Hello");
				try {
					Thread.sleep(500);
				} catch (InterruptedException e) {e.printStackTrace();}
			}
			
	});
		Thread t2 = new Thread(()-> {
			for(int i=0 ; i<5;i++) {
				System.out.println("Hii");
				try {
					Thread.sleep(500);
				} catch (InterruptedException e) {e.printStackTrace();}
			}
			});
		
		t1.start();
		t2.start();
	
		
		System.out.println(	t1.isAlive());
		
		t1.join();
		t2.join();System.out.println(	t1.isAlive());
		
		System.out.println("Byee");

	}

}


