package Day5;
import java.util.*;
public class ForEachMatrix {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of rows");
		int a = sc.nextInt();
		System.out.println("Enter number of colums");
		int b = sc.nextInt();
		
		   int r[][] = new int[a][b];
		   
		   for(int i = 0 ; i<a;i++) {
			   for(int j = 0;j<b;j++) {
				   System.out.println("Enter row "+i+" column "+j);
				   r[i][j] = sc.nextInt();
			   }
		   }
		   
	//traversing array
	//foreach
	for(int y[]:r)
	{
	 for(int k:y)
	 {
	     System.out.print("   "+ k);

	 }
	 System.out.println();
	}

	}

}
