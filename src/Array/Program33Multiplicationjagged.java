package Array;
//Multiply Two Matrices - Jagged Array
public class Program33Multiplicationjagged {
    public static void main(String[] args) {
    int row=2,col=3;
    int row1=3,col1=2;
    int first[][]={{3,-3,5},{3, 0, 4}};
    int second[][]={{2, 3}, {-9, 0}, {0, 4}};
    int[][] pro = new int[row][col1];

    for(int i=0; i<row; i++)
    {
        for(int j=0;j<col1; j++)
        {
            for (int k=0; k<col;k++)
            {
                pro[i][j] += first[i][k]*second[k][j];
            }
        }
    }
    System.out.println("Multiplication of two matrices is: ");
        for(int[] row2 : pro)
         {
            for (int column : row2) 
            {
                System.out.print(column + "    ");
            }
            System.out.println();
         }
}
}