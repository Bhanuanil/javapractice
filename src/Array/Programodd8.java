package Array;
//8) Java Program to print the elements of an array present on odd position
public class Programodd8 {
    public static void main(String[] args) {
        int arr[]= new int[]{1,2,3,4,5,6,7};
        System.out.println("Elements of given array present on odd position:");
        for(int i=0;i<arr.length;i=i+2)
        {
          System.out.println(arr[i]);
        }
    }
    
}
