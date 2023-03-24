package Array;
//4) Java Program to print the duplicate elements of an array
public class ProgramDuplicate4 {
    public static void main(String[] args) {
        int arr[]= new int[]{ 1,2,3,4,5,6,2,3,4,5};
        System.out.println("Duplicate elements in given array: "); 
        for(int i = 0; i < arr.length; i++) {  
            for(int j = i + 1; j < arr.length; j++)
            {
               if(arr[i]==arr[j])
               {
                System.out.println(arr[j]);
                }
            }
    }  
}
}
