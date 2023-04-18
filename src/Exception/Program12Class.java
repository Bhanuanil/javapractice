package Exception;
//12.	Java Program to Handle Class Not Found Exception
public class Program12Class {
    public static void main(String args[])
    {
        // Try block to check for exceptions
        try {
 
            Class.forName(" Program12");
        }
 
        // Catch block to handle exceptions
        catch (ClassNotFoundException ex) {
 
            // Displaying exceptions on console along with
            ex.printStackTrace();
        }
    }
}
