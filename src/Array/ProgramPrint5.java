package Array;

public class ProgramPrint5 {
    public static void main(String[] args) {
    int arr[]= new int[]{ 1,2,3,4,5,6,7};
    System.out.println(" Print using for each loop");
    for(int A1:arr)
    {
        System.out.print(A1+ " ");
    }
    System.err.println();
    System.err.println(" Print using for loop");
    for(int i=0;i<arr.length;i++)
    {
        System.err.print(arr[i]+ " ");
    }
}
}
