package Exception;
//7 Java Program to Use Catch to Handle Chained Exception
public class Program7ChainException {
    public static void main(String[] args) {
        try{
            NumberFormatException ex = new NumberFormatException();
            ex.initCause(new NullPointerException("This is actual cause of the exception"));
            throw ex;
        }catch(NumberFormatException ex)
        {
            System.out.println(ex);
 
            // Getting the actual cause of the exception
            System.out.println(ex.getCause());
        }
    }
    
}
