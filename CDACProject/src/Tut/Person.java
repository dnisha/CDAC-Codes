package Tut;


class Person
{
String name;
int age;
Person(){}
Person(String n,int age)
{
this.name=name;
this.age=age;
}
Person (Person s)
{
this.name=s.name;
this.age=s.age;
}
void display(){System.out.println(name+""+age);}
public static void main(String aa[])

{
Person p= new Person("neha",23);
Person x= new Person(p.name,p.age);
Person k= new Person(p);
Person h= k;//both h & k refers to same memory address 

}}