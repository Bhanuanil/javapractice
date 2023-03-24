package Array;
//Java Program to sort the elements of an array in ascending order
public class ProgramAccending14 {
    public static void main(String[] args) {
        int arr[]= new int[]{4,6,2,6,8,7,0};
        int temp=0;
        System.out.println(" Elements of original Array ");
        for(int i=0; i<arr.length; i++)
        {
            System.out.print(+arr[i]+ " ");
        }
        for(int i=0;i<arr.length;i++)
        {
            for(int j=i+1; j<arr.length;j++)
           {
            if (arr[i]>arr[j])
            {
                temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }
           }
        }
        System.out.println();
        System.out.println( "Elements of array sorted in ascending order");
        for(int i=0;i<arr.length;i++)
        {
           System.out.print(arr[i]+ " ");
        }
    }
    
}
