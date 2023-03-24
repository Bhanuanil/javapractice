package Exception;
//6.Java Program that Implement the Nested Try Statements
public class Program6Nestedtry {
    public static void main(String[] args) {
        try{
            int a[]={1,2,3,4,5,6};
            System.out.println(a[6]);
            try{
                int x= a[2]/0;
            }catch(ArithmeticException e)
            {
                System.out.println(" division by zero");
            }
        }
        catch(ArrayIndexOutOfBoundsException e1)
        {
            System.out.println("ArrayIndexOutOfBoundsExceptio ");
            System.out.println("Element at such index does not exists");
        }
        }
    }
    

