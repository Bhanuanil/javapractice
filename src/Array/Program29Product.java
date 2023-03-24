package Array;
//29) Java Program to find the product of two matrices
public class Program29Product {
    public static void main(String[] args) {
        int a[][]= {{1,1,1},{2,2,2},{3,3,3}};
        int b[][]={{1,1,1},{2,2,2},{3,3,3}};
        int c[][]=new int[3][3];
        
         for(int m=0;m <a.length;m++)
        {
        for(int j=0;j<b.length;j++)
        {    c[m][j]=0;
            for(int k=0; k<3; k++)
            c[m][j]+=a[m][k]*b[k][j];
            System.out.print(c[m][j]+ " ");
        }
        System.out.println();
        }    
    }
}
