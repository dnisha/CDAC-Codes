package Multithreading;

class Mytask4 implements Runnable
{
    @Override
	public void run()
	{try {
		for( int i=0;i<10;i++)
		{
			System.out.println(i+1+ "hello");
			Thread.sleep(500); 
		}}catch(Exception r) {}
	}
}

class Mytask5 implements Runnable
{
    @Override
	public void run()
	{try {
		for( int i=0;i<10;i++)
		{
			System.out.println(i+1+ "mytask5");
			Thread.sleep(500); 
		}}catch(Exception r) {}
	}
}



public class ThreadExample4 {

	public static void main(String[] args) throws Exception
	{
		Mytask4 m = new Mytask4();
		Mytask5 m1= new Mytask5();
		
		Thread p=  new Thread(m);
		Thread p2= new Thread(m1);
		p.start();
		p2.start();
		
		
		for(int i=0;i<10;i++)
		{
		System.out.println("welcome");
		Thread.sleep(1000);  
		}
		
	}

}
