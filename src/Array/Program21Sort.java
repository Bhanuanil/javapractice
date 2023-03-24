package Array;

import java.util.Arrays;

//) How to Sort an Array in Java
public class Program21Sort {
    public static void main(String[] args) {
        int arr[]= new int[]{12,34,54,23,45,66,89,56};
        Arrays.sort(arr);
        System.out.println(" Element of array stored i acending order");
    for(int i=0;i<arr.length;i++)
    {
        System.out.print(arr[i]);
    }
    } 
}
