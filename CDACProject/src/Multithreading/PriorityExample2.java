package Multithreading;
class Test5 implements Runnable 
{
	Thread t;
	String msg;
	int p;
	Test5(String e, int p)	
	{
		t= new Thread(this);
		msg=e;
		this.p= p;
		t.setPriority(p);
		t.start();
		
		}
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
public class PriorityExample2 {

	public static void main(String[] args) 
	{
		 Test5 t= new Test5("hello",Thread.MAX_PRIORITY);//10 
		 Test5 t1= new Test5("welcome",Thread.NORM_PRIORITY);//5
		 Test5 t3= new Test5("test1",Thread.NORM_PRIORITY+1);//6
	 
		 
		 

	}

}
