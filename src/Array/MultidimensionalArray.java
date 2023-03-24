package Array;

public class MultidimensionalArray
 {
    public static void main(String[] args) {
        int a[][]= new int[3][3];
        int b [][]= new int[3][3];
        int c[][] = new int[3][3];
          a[0][0]=8;
          a[0][1]=8;
          a[0][2]=8;
          a[1][0]=2;
          a[1][1]=2;
          a[1][2]=2;
          a[2][0]=3;
          a[2][1]=3;
          a[2][2]=3;
          b[0][0]=1;
          b[0][1]=1;
          b[0][2]=1;
          b[1][0]=2;
          b[1][1]=2;
          b[1][2]=2;
          b[2][0]=4;
          b[2][1]=4;
          b[2][2]=4;
       // System.out.print(a[3][3]+ " ");

        for(int i=0;i<a.length;i++)
        {
        for(int j=0;j<b.length;j++)
        {
            c[i][j]=a[i][j]+b[i][j];
            System.out.print(c[i][j]+ " ");
        } 
        System.out.println();
       /*  {
         for(int m=0;m <a.length;m++)
        {
        for(int j=0;j<b.length;j++)
        {
            for(int k=0; k<c.length; k++)
            c[m][j]=a[m][k]*b[m][k];
            System.out.print(c[i][j]+ " ");
        }
        System.out.println();
        }
        
       }*/
    }
    }
    
    
}


