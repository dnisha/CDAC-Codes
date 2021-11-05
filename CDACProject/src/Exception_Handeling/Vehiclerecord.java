package Exception_Handeling;
class vehicle
{
	void speed(int x)throws Exception
	{
		if( x>180)   		throw new Exception();	
	
		else
		System.out.println("vehicle speed"+x);
	}
}




public class Vehiclerecord {

	public static void main(String[] args)
	{
		try
		{vehicle v= new vehicle();
		v.speed(230);
		}catch(Exception e)
		{
			System.out.println(" v1 object speed is higer");
		}
		
		
		
		try {
		vehicle r= new vehicle ();
		r.speed(450);
		}catch(Exception h) {
			System.out.println(" v2 object speed is higer");
		}
	}

}
