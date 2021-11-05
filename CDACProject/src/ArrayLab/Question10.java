package ArrayLab;
import java.util.Scanner;

public class Question10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter 1 to add two matrix :");
		System.out.println("Enter 2 to multiply two matrix :");
		System.out.println("Enter 3 to exit application :");
		
		int val = sc.nextInt();
		
		if(val == 1) {
			
			
			System.out.println("Enter row of matrix :");
			int r = sc.nextInt();
			System.out.println("Enter column of matrix :");
			int c = sc.nextInt();
			
			int a[] [] = new int [r][c];
			int b[] [] = new int [r][c];
			int x[] [] = new int [r][c];
			
			System.out.println("Enter the values of first metrix");
			for(int i=0;i<r;i++) {
				for(int j=0;j<c;j++) {
					System.out.println("value at "+i+" row "+" and "+j+" column");
					
					a[i][j] = sc.nextInt();
	}
			}
			System.out.println("Enter the values of second metrix");
			
			for(int i=0;i<r;i++) {
				for(int j=0;j<c;j++) {
					System.out.println("value at "+i+" row "+" and "+j+" column");
					
					b[i][j] = sc.nextInt();
					
				}
			
		}
			System.out.println("The final matrix is :");
			
			for(int i=0;i<r;i++) {
				for(int j=0;j<c;j++) {
					x[i][j] = a[i][j] + b[i][j];
				}
				
			}
			for(int i=0;i<r;i++) {
				for(int j=0;j<c;j++) {
					System.out.print(x[i][j]+" ");
				}
				System.out.println();
				
			}
			
			
			
		}
			
		else if(val ==2) {
			
			System.out.println("Enter row of first  matrix :");
			int r1 = sc.nextInt();
			System.out.println("Enter column of first matrix :");
			int c1 = sc.nextInt();
			
			System.out.println("Enter row of second  matrix :");
			int r2 = sc.nextInt();
			System.out.println("Enter column of second matrix :");
			int c2 = sc.nextInt();
			
			int a[] [] = new int [r1][c1];
			int b[] [] = new int [r2][c2];
			int x[] [] = new int [r1][c2];
			
			System.out.println("Enter the values of first metrix");
			for(int i=0;i<r1;i++) {
				for(int j=0;j<c1;j++) {
					System.out.println("value at "+i+" row "+" and "+j+" column");
					
					a[i][j] = sc.nextInt();
	}
			}
			System.out.println("Enter the values of second metrix");
			
			for(int i=0;i<r2;i++) {
				for(int j=0;j<c2;j++) {
					System.out.println("value at "+i+" row "+" and "+j+" column");
					
					b[i][j] = sc.nextInt();
					
				}
			
		}
			
			if(c1 == r2) {
				
				 for(int i=0;i<r1;i++)
			        {
			            for(int j=0;j<c2;j++)
			            {
			             for(int k=0;k<r1;k++)
			             {

			                x[i][j]+=a[i][k]*b[k][j];       
			            }}
			    }
				 
				 System.out.println("The final matrix is: ");

			    for(int i=0;i<r1;i++)
			    {
			        for(int j=0;j<c2;j++)
			        {
			            System.out.print("  "+x[i][j]);
			        }
			    System.out.println();
			    }
				
			}
			else {
				System.out.println("Matrix cannot be multiplied....!");
			}
			
			
			
			
			
		}
		else {
			System.out.println("You exit the application..!");
		}
	}

}
