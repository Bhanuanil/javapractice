package Exception;
//23.	Java Program to IllustrateTry, Catch and Finally Blocks
public class Program23TryCatchFinally {
    public static void main(String[] args) {
        try{
            int arr[]= new int[5];
            arr[3]=30/0;

        }catch(ArithmeticException e)
        {
            System.out.println(" We can not divided wit zero" +e);
        }finally
        {
            System.out.println(" Final block");
        }
    }
}
