package Array;
//) Java Program to right rotate the elements of an array
public class ProgramRightrotate13 {
    public static void main(String[] args) {
        int arr[]= new int[]{2,3,6,5,7,8,9};
        int n=4;
        System.out.println("Original array");
        for(int i =0; i<arr.length;i++)
        {
            System.out.print(arr[i]+ " ");
        }//  //Rotate the given array by n times toward right
        for(int i=0;i<n;i++)
       
        {
            int j , last;
             //Stores the last element of array   
            last=arr[arr.length-1];  
            for(j = arr.length-1; j > 0; j--){    
               //Shift element of array by one    
                arr[j] = arr[j-1];    
            }  
         //Last element of array will be added to the start of array.  
           arr[0]=last;
        }
        System.out.println();    
            
        //Displays resulting array after rotation    
        System.out.println("Array after right rotation: ");    
        for(int i = 0; i< arr.length; i++){    
            System.out.print(arr[i] + " ");    

    }
}
}
