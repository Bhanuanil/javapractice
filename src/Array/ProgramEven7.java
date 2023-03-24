package Array;
//Java Program to print the elements of an array present on even position
public class ProgramEven7 {
    public static void main(String[] args) {
        int arr[]= new int[]{1,2,3,4,5,6,7};
        int a1[]= new int[]{1,2,3,3,2,2,4,5,45,3,4,5,2,6,7,8,9,0,6,3};
        arr=a1;
        System.out.println("Elements of given array present on even position:"+ arr.length);
        for(int i=1;i<arr.length;i=i+2)
        {
          System.out.println(arr[i]);
        }
    }
}
