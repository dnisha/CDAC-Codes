package Day5;

public class MatrixMul {

    public static void main(String[] args) 
    {
        int a[][]= {{2,3}    
                   ,{3,4}};
        int b[][]= {{2,3 ,1},
                    {3,4 ,2}};

        int c[][]= new int[2][3];

        for(int i=0;i<2;i++)
        {
            for(int j=0;j<3;j++)
            {
             for(int k=0;k<2;k++)
             {

                c[i][j]+=a[i][k]*b[k][j];       
            }}
    }

    for(int i=0;i<2;i++)
    {
        for(int j=0;j<3;j++)
        {
            System.out.print("  "+c[i][j]);
        }
    System.out.println();
    }
 
    
}
    

}
