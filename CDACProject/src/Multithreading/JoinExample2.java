package Multithreading;
class Test1 extends Thread
{
	String msg;
	Test1(String e)	{		msg=e;	}
public void run()
{
	try
	{
		for(int i=0;i<10;i++)
		{
			System.out.println("in Test1"+msg);
			Thread.sleep(1000);
		}
	}catch(Exception e) {}
}
	
}

class Test2 extends Thread
{
	String msg;
	Test2(String e)	{		msg=e;	}
public void run()
{
	try
	{
		for(int i=0;i<10;i++)
		{
			System.out.println("in Test2"+msg);
			Thread.sleep(1000);
		}
	}catch(Exception e) {}
}
	
}

public class JoinExample2 {

	public static void main(String[] args) throws Exception {
		 Test1 t = new Test1("BigData");
		 Test1 t1= new Test1("java");
		 Test1 t2= new Test1("PHP");
		 Test2 t3= new Test2("welcome");
		 t.start();
		 t1.start();
		
		 t2.start();
	     t.join();// acquire a lock on above started object 
		 t3.start();
		 for(int i=0;i<10;i++)
		 {
			 System.out.println("in main");
			 Thread.sleep(1000);
		 }

	}

}
