package Array;
//12) Java Program to print the sum of all the items of the array
public class ProgramSum12 {
    public static void main(String[] args) {
        int a[]=new int[]{23,45,6,7,34,12};
        int sum=0;
        for(int i=0;i<a.length;i++)
        {
            sum=sum+a[i];
        }
        System.out.println(" Sum of all the items of the array - " +sum);
    }
    
}
