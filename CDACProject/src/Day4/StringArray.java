package Day4;
import java.util.*;

public class StringArray {
	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
        int record;
        System.out.println("how many records you want to store");
        record= s.nextInt();
        String name[]= new String[record];
        Scanner s1= new Scanner(System.in);
        for(int i=0;i<record;i++)
            {
            System.out.println("enter name");
        	
            name[i]= s1.nextLine();
            }
        System.out.println("Records has name: ");
         for(String r:name)
            System.out.println(r);
	}

}
