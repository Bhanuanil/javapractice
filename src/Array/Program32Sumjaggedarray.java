package Array;
//Add Two Matrices – Jagged Array
public class Program32Sumjaggedarray {
    public static void main(String[] args) {
        int row=2, col=3;
    int a[][]={{2,3,4},{5,2,3}};
    int b[][]={{-4,5,3},{5,6,3}};
    int sum[][]=new int[row][col];
    for(int i=0;i<row;i++)
    {
        for(int j=0;j<col;j++)
        {
            sum[i][j]=a[i][j]+b[i][j];
        }
    }
    System.out.println("Sum of two matrix is :");
    for(int[] ro:sum)
    {
        for(int co:ro)
        {
            System.err.print(co + "    ");
        }
        System.out.println();
    }
    }
    


    
}
