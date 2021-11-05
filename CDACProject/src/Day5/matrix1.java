package Day5;

public class matrix1 {

	public static void main(String[] args) {


	       int r[][]= {{22,33,44,55},
                   {3,45,22,33},
                   {30,40,50,45}};
//traversing array
//rigid loop         

for(int i=0;i<3;i++)  
{                      
    for(int j=0;j<4;j++)
    {
        System.out.print("   "+ r[i][j]);

    }
    System.out.println();
}

   }



	}


