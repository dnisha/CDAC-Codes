package oopswithjava_4;

public class copyCon {
   int a;
   int b;

	copyCon(int x,int y){      a=x;		b=y; }
	copyCon(){}
	void display()
	{		System.out.println(a+"  "+b);	}
	
	copyCon(copyCon e)
	{//c3.a ==c1.a
		this.a=e.a;
		this.b=e.b;
	}
	public static void main(String[] args) {
	  //copy data of one object to another
		copyCon c= new copyCon(22,33);
	  copyCon c1= new copyCon(22,33);
	  //copyCon c2= new copyCon();
	  //c2.a=c1.a;
	  //c2.b=c1.b;
	  copyCon c3= new copyCon(c1);
     //c4 and c1 both point to same memory address 
	  copyCon c4=c1;
//	 
//	  c1.display();
//	  c3.display();
	System.out.println(c1);
	System.out.println(c3);
	}

}
