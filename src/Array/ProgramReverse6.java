package Array;

import java.util.Scanner;

//6) Java Program to print the elements of an array in reverse order
public class ProgramReverse6 {
    public static void main(String[] args) {
        int a[]= new int[5], i;
        // Reverse order using Scanner
        Scanner sc =new Scanner(System.in);
        System.out.println(" Enter the values");
        for(i=0;i<5;i++)
        {
            a[i]=sc.nextInt();
        }
        System.out.println(" Reverse order ");
        for(i=4;i>=0;i--)
        {
            System.out.println(a[i]+ " ");
        }
        // reverse order 
        int b[]= new int[]{1,2,3,4,5,6};
        System.out.println(" original order ");
        for(int k:b)
        {
            System.out.print(k+ " ");
        }
        System.out.println();  
        System.out.println("Array in reverse order: ");  
        //Loop through the array in reverse order  
        for (int m = b.length-1; m >= 0; m--) 
        {  
            System.out.print(b[m] + " ");  
        }
    
}
}


