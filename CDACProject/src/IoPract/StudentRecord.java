package IoPract;
import java.io.*;
//wap that store student info in file 

class Appendable extends ObjectOutputStream
{
	public Appendable(OutputStream out) throws IOException {
		super(out);
	}
	@Override
	protected void writeStreamHeader() {}
}

public class StudentRecord {

	public static void main(String[] args) throws Exception {
		
	Student s1= new Student();
    s1.input();
       
    FileOutputStream f= new FileOutputStream("Student2.ser",true);
    File fi= new File("Student2.ser");
    int len=(int) fi.length();
    if( len<=0)
    {
    ObjectOutputStream o= new ObjectOutputStream(f); 
	o.writeObject(s1);// writeStreamHeader(){..........#$%%#}
	o.close();
	f.close();
    }
    else
    {
    Appendable ap= new Appendable(f); 
  	ap.writeObject(s1);//writeStreamHeader(){empty } we have overridden this method
   	ap.close();
  	f.close();
     }
    int count=0;
    Student k= new Student();
    try
    {
    ObjectInputStream oi= new ObjectInputStream(new FileInputStream("Student2.ser"));
  
    
    do
    	{
    	k=(Student)oi.readObject();
    	k.display();
    	count++;
    	    		
    	}
	while(k!=null);
    
}catch(Exception d) {}
   Student.countStudent(count);
	System.out.println(count);
	}
	

}
