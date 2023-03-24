package Array;
//10) Java Program to print the smallest element in an array
public class ProgramSmallest {
    public static void main(String[] args) {
        {
            int arr[]= new int[]{23,45,67,89,33,49,60};
            int min=arr[0];
            for(int i=0;i<arr.length;i++){
            if(arr[i]<min)
                min=arr[i];
             }
             System.out.print(  "Smallest element in given array:" + min) ;
        }
        
    }
    
}
