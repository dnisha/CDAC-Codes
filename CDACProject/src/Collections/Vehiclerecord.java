package Collections;
import java.util.*;

public class VehicleRecord {

	public static void main(String a[])
	{
		//creating 10 referencess of class vehicledata 
		Vehicledata v[]= new Vehicledata[10];
		String h;
		int j;
		Scanner s= new Scanner(System.in);
		LinkedList l= new LinkedList();
		  
		for(int i=0;i<3;i++)
		{    System.out.println("enter moddelno and price");
		     h= s.next();
		     j= s.nextInt();
		 	
			v[i]= new Vehicledata(h,j);
			l.add(v[i]);
		}
		
		System.out.println(l);

	}
}
