package Multithreading;

class Mytask2 extends Thread

{
	public void run()
	{try {
		for( int i=0;i<10;i++)
		{
			System.out.println(i+1+ "hello");
			Thread.sleep(500);//always throws checked exception 
		}}catch(Exception r) {}
	}
}
public class ThreadExample3 {

	public static void main(String[] args) throws Exception
	{
		
		//new Thread(new Mytask2()).start();
		//Mytask2 m= new Mytask2();
		Mytask2 m= new Mytask2();
		m.start(); // start will make it child of main thread
		           // sub process of main
		for(int i=0;i<10;i++)
		{
		System.out.println("welcome");
		Thread.sleep(1000);  
		}
		
	}

}
