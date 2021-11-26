package Multithreading;

class MyTask7 implements Runnable
{

	Thread t;

MyTask7()
{
	t = new Thread(this);
	t.start();
}

	@Override
	public void run() {
		{try 
		  {
			for( int i=0;i<10;i++)
			{
				System.out.println(i+1+ "hello");
				Thread.sleep(500); 
			}}catch(Exception r) {}
		}}
	
}
public class Threadexample5_Runnable {

	public static void main(String[] args) {
		
		//Thread p= new Thread(new MyTask7());
		//p.start();
		
		MyTask7 m= new MyTask7();
		MyTask7 m1= new MyTask7();
		MyTask7 m2= new MyTask7();
		
		

	}

}
