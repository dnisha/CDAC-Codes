package oopswithjava_4;
import Day3.*;
import java.util.*;
//wap in java,define class Empref which print emp class data 
class emp
{	String name;
	int age;
	emp(String n,int a)
	{		name=n;		age=a;	}
}
public class Emp_ref {
	void print(emp r,String code)
    {   pattern1 p= new pattern1(); 	
		System.out.println(r.name+"  "+r.age);    }
	
public static void main(String[] args) 
{
	emp e= new emp("neha",21);
	Emp_ref x= new Emp_ref();
	x.print(e,"p45");

	}

}


