package Exception_Handeling;
// we created userdefined exception class by inheriting Exception 

//it is now checked exception type class 
public class AdmissionException extends Exception 
{
public AdmissionException()
{
	System.out.println("admmission exception occured");

}
public AdmissionException(String s)
{  super(s);
	System.out.println("admmission exception occured");
}


//public String getMessage(){	return "nexttime";}
}
