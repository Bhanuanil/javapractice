package Exception;
//2.	Java Program to Catch Multiple Exception Types
public class Program2multipleCatch {
    public static void main(String[] args) {
        try{
            int arr[]=new int[100];
            arr[10]=30/0;
        }
        catch(ArithmeticException  e)
        {
            System.out.println(e.getMessage());
        }
        catch(ArrayIndexOutOfBoundsException e)
        {
            System.out.println(e.getMessage());
        }
        catch(Exception e)
        {
            System.out.println(e.getMessage());
        }
    }
    
}
