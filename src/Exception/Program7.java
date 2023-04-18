package Exception;
//7.	Java Program to Use Catch to Handle Chained Exception
public class Program7 {
    public static void main(String[] args) {
        try{
            int num[]= new int[5];
            int divisor=0;
            for(int i=0;i<num.length;i++)
            {
                int result =num[i]/divisor;
                System.out.println(result);
            }
        }catch(ArithmeticException ar)
        {
            throw new RuntimeException("Error: division by zero", ar);
        }
    }
    
}
