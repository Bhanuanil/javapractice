//8.	Java Program to Find Factorial of a Number
public class program8 {
    public static void main(String[] args) {
      //using for loop
        int i, fact=1, num=5;
        for(i=1;i<=num;i++)
        {
            fact=fact*i;
        }
       System.out.println("facorial of " +num + " is = " +fact);
       // using while loop
       int a=1, f=1, n=5;
       while(a<=n)
       {
        f=f*a;
        a++;
       }
       System.out.println("Factorial of " +n+ " is = " +f);
    }

    
}
