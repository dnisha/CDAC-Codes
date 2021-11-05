package IoStream;
import java.io.*;

public class Student implements Serializable
{
  String name;
  Student(String a)
  {
	  name=a;
  }
  void display()
  {
	  System.out.println(name);
  }
	public static void main(String[] args) throws Exception 
	{
Student s= new Student("manish");
ObjectOutputStream o;
o= new ObjectOutputStream(new FileOutputStream("abc.txt",true));
o.writeObject(s);//-->convert s to binary and write to file
o.close();
// file reading 
ObjectInputStream i= new ObjectInputStream(new FileInputStream("abc.txt"));
s=(Student)i.readObject();//downcast   readObject return Object



s.display();
s.display();


		
		
		
	}

}
