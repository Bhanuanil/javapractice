package Array;
//31) Java Program to find the transpose of a given matrix
public class Program30Transpose {
    public static void main(String[] args) {
        int a[][]={ {1,3,4},{2,4,3},{3,4,5}};
        int t[][]=new int[3][3];
    //code for transpose a matrix
    for(int i=0; i<3;i++)
    {
        for(int j=0;j<3;j++)
        {
            t[i][j]=a[j][i];
        }
    }
    System.out.println("Printing Matrix without transpose:");  
    for(int i=0;i<3;i++)
    {    
      for(int j=0;j<3;j++)
      {    
        System.out.print(a[i][j]+" ");    
      }
      System.out.println();    
    }
    System.out.println("Printing Matrix After Transpose:");  
     for(int i=0;i<3;i++)
     {    
       for(int j=0;j<3;j++)
       {    
        System.out.print(t[i][j]+" ");    
        }    
          System.out.println();   
     }    
    }
}
