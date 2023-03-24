package Array;
//23) Java Program to determine whether a given matrix is an identity matrix
public class Program23identity 
{
    public static void main(String[] args) 
    {
        int row;
        int cols;
        boolean flag = true;
        int a[][]={{1,0,0},{0,1,0},{0,0,1}};
        row = a.length;    
        cols = a[0].length;  
        if(row!=cols)
        {
            System.out.println("Matrix should be a square matrix"); 
        }
        else {    
            //Checks if diagonal elements are equal to 1 and rest of elements are 0    
            for(int i = 0; i < row; i++)
            {    
                for(int j = 0; j < cols; j++)
                {
                if(i==j&&a[i][j]!=1)
                {
                    flag = false;    
                    break;    
                }
                if(i != j && a[i][j] != 0){    
                    flag = false;    
                    break;    
                }    
                }
            }
            if(flag)    
            System.out.println("Given matrix is an identity matrix");    
        else    
            System.out.println("Given matrix is not an identity matrix");
            }
    }
}
