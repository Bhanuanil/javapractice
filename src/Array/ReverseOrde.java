package Array;

import java.util.Scanner;

public class ReverseOrde {
    public static void main(String[] args) {
        int a[]= new int[5], i;
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
    }
    
}
