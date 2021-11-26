package Multithreading;
class MyTask extends Thread
{
	public void run()
	{try {
		for(int i=0;i<10;i++)
			{
			System.out.println("printer2");
		    Thread.sleep(1000);
		    }
	}catch(Exception r)
	{	
	}
	}
}
public class ThreadExample2 {
	public static void main(String[] args)throws Exception
	{
		MyTask m= new MyTask();
		m.start();// start method of thread class will call run method
		
		System.out.println("Application started");
		for(int i=0;i<10;i++)
		{
			System.out.println("printer1");
			Thread.sleep(1000);
			
		}
		System.out.println("Application finished");
	}

}
