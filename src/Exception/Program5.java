package Exception;
//5.	Java Program to Pass Arguments While Throwing Checked Exception
public class Program5 {
    public static void main(String[] args) {
        try{
            throw new Exception("Throwing an exception ");
        }catch( Exception e)
        {
          System.out.println(e.getMessage());  
        }
    }
    
}
