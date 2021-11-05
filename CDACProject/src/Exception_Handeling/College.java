package Exception_Handeling;

public class College {
//either we handle exception by using try catch 
//or we pass exception by using throws	
	static void getaddmission(int grade)throws AdmissionException
	{
		if(grade>90)
			System.out.println("eligible for admission");
		else
			throw new AdmissionException("Try nexttime ");
	}
	public static void main(String[] args)throws AdmissionException
	{
		//try {	
		getaddmission(89);		//}
		//catch(Exception t) {System.out.println("grade is low");
		//}
		System.out.println("after error ");
	}

}
