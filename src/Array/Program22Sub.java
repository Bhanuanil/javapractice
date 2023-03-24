package Array;
//Java Program to subtract the two matrices
public class Program22Sub {
    public static void main(String[] args) {
        int row,cols;
        int a[][]=new int[][]{{4,5,6},{3,4,1},{1,2,3}};
        int b[][]=new int[][]{{3,2,4},{3,2,1},{1,1,2}};
        row=a.length;
        cols=a[0].length;
        int diff[][] = new int[row][cols]; 
        for(int i=0;i<row;i++) 
        {
            for(int j=0;j<cols;j++)
            {
                diff[i][j]=a[i][j]-b[i][j];
            }
        } 
        System.out.println(" Subtraction of two matrics");
        for(int i=0;i<row;i++) 
        {
            for(int j=0;j<cols;j++)
            {
                System.out.print(diff[i][j]+ " ");
            }
            System.out.println();  
        }
    }
    
    
}
