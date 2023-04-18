package Exception;
//11.	Java Program to Handle Multiple Exceptions (Array Out of Bound)
public class Program11 {
    public static void main(String[] args) {
        try{
            int arr[]= new int[10];
             arr[15]=30/9;

        }catch(ArrayIndexOutOfBoundsException | ArithmeticException e)
        {
            System.out.println(e.getMessage());
        }
    }
}
