package Array;
//3) Java Program to left rotate the elements of an array
public class ProgramRotate {
    public static void main(String[] args) {
        int a[]=new int[]{1,2,3,4,5,6,7};
        int b[]=new int[a.length];
       int n=3;
        System.out.println(" original array ");
        for( int i=0;i<a.length;i++)
        {
            System.out.print(a[i]+ " ");
        }
        for(int i = 0; i < n; i++){  
            int j, first;  
            
            //Stores the first element of the array  
            first = a[0]; 
        
        for(j = 0; j < a.length-1; j++){  
            //Shift element of array by one  
            a[j] = a[j+1];  
           }    
            //First element of array will be added to the end  
            a[j] = first;  
        }  
        System.out.println();  
        //Displays resulting array after rotation  
        System.out.println("Array after left rotation: ");  
        for(int i = 0; i< a.length; i++){  
            System.out.print(a[i] + " ");  
        }  
        
    }
    
}
