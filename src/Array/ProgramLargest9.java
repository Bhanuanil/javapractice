package Array;
//9) Java Program to print the largest element in an array
public class ProgramLargest9 {
    public static void main(String[] args) {
        int arr[]= new int[]{23,45,67,89,33,49,60};
        int max=arr[0];
        for(int i=0;i<arr.length;i++){
        if(arr[i]>max)
            max=arr[i];
         }
         System.out.print(  "Largest element in given array:" + max) ;
    }  
}
