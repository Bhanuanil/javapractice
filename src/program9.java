//9.	Java Program to Calculate the Sum of Natural Numbers
public class program9 {
    public static void main(String[] args) {
        int i, sum=0, n=10;
        for( i=1;i<=n;i++)
        {
            sum=sum+i; 
        }
        System.out.println("Sum of Natural number of " + n+ " is ="+ sum);
        // using while loop
        int a=1, s=0, num=100;
        while(a<=num)
        {
            s=s+a;
            a++;
        }
        System.out.println("Sum of Natural number of 100 is ="+ s);
    }
    
}
