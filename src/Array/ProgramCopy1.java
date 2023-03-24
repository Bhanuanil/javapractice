package Array;
//1) Java Program to copy all elements of one array into another array
public class ProgramCopy1 {
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
     //copying using arraycopy method for single dimension
     char[] copyFrom={'a','b','c','d','g','e','k','l','m'};
     char[] copyto=new char[7];
     System.out.println();
     System.arraycopy(copyFrom,2, copyto,0, 6);
     System.out.println(" Copy of array using arraycopy method");
     System.out.print(String.valueOf(copyto)+ " ");
}
}