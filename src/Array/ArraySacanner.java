package Array;

import java.util.Scanner;

public class ArraySacanner {
    public static void main(String[] args) {
        int len;
        Scanner sc = new Scanner(System.in);
        System.out.println(" Enter array length");
        len =sc.nextInt();
        int a[] = new int[len];
        System.out.println("Enter " +len + " Element to store in array");
        for ( int i=0;i<len; i++)
        {
            a[i]=sc.nextInt();

        }
        System.out.println("Element in array are ");
        for(int i=0; i<len ; i++)
        {
            System.out.println(a[i]+ " ");
        }

        // Display only even number
        int E[ ]= new int[10];
        System.out.println( " Enter 10 number");
        for(int j=0 ; j<10; j++)
        {
        E[j]=sc.nextInt();
        }
        System.out.println(" list of even number");
        for(int j = 0; j<10;j++)
        {
            if (a[j]%2==0)
            {
               System.out.println(a[j]+ " "); 
            }
        }


        }
    
}
