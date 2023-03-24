package Array;

public class CloningArray {
    public static void main(String[] args) {
        int arr[]= {1,2,3};
        System.out.println(" Print the original Array");
        for(int i: arr)
        {
            System.out.print(i+ " ");
        
        }
        System.out.println();
        System.out.println(" Printing clone of the array");
        int chr[]= arr.clone();
        for(int i:chr)
        {
            System.out.print(i+ " ");
        }
        // clone for multidimension array
        int a[][]={{1,2,3},{3,3,3},{2,2,2}};
        System.out.println();
        System.out.println(" Print the original Array");
        for(int k=0; k<3;k++)
        {
        for(int l=0;l<3;l++)
        {
            System.out.print( a[k][l]+ " ");
        }
        System.out.println();
        }
        System.out.println(" Printing clone of the array");
       /*  int chaa[][]= a.clone();
        for(int c[]:chaa )
        {
             System.out.println(c+ " ");
        }*/
        int c[][]= new int[3][3];
        for(int i=0; i<a.length; i++)
        {
           for(int j=0; j<a[i].length; j++)
               { 
                 c[i][j]=a[i][j];
                 System.out.print(c[i][j]+ " ");
               }
               System.out.println();
        }
     //copying using arraycopy method for single dimension
    char[] copyFrom={'a','b','c','d','g','e','k','l','m'};
    char[] copyto=new char[7];
    System.arraycopy(copyFrom,2, copyto,0, 6);
    System.out.print(String.valueOf(copyto)+ " ");

    // copying using arraycopy method for multidimention
    int d[][]={{1,2,3},{2,3,4},{3,4,5}};
    int o[][]= new int[2][3];
    
}
}

