package Test;


interface testing
{ 
	void testcase1();
void testcase2();
}
public class Upcasting {
void getTest()
{//local class 
class UnitTest1 implements testing
{
public void testcase1() {System.out.println("testcase1");}
public void testcase2() {System.out.println("testcase2");}
}
testing t= new UnitTest1();
t.testcase1();
t.testcase2();
//example for annonymous
//t is reference of parent class pointing child class
//object 
//child class doesnot has name here 
testing t2= new testing()
{
public void testcase1() {
System.out.println("local testcase1");
}
public void testcase2() {
System.out.println("local testcase2");
}
};
t2.testcase1();
t2.testcase2();
}
public static void main(String[] args) {
Upcasting u= new Upcasting();
u.getTest();
}
}