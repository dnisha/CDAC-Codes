package Anonymous;

public class Myclass {
void Tester() {
class CallTest implements Junittest{
public void test1() {
System.out.println("this the first test ");
}
public void test2() {
System.out.println("this is second test");
}}
Junittest c = new CallTest();
c.test1();
c.test2();}
public void TesterAnnonymous() {
Myclass m= new Myclass()//annonymous class
{public void input() {
System.out.println("this is input method in annonymous class");
}
public void display() {
System.out.println("i have given all test");}

}.input();
}
public static void main(String[] args) {
Myclass m = new Myclass();
m.Tester();
m.TesterAnnonymous();


}
}