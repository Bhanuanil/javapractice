package Exception;

public class TryCatchCatch {
    public static void main(String[] args) {
        try{ int a[]=new int[5];
        a[5]=30/0;
        }
       
        catch(ArithmeticException e)
        {
            System.out.println(" Arithmatic Exception occure ");
        }
        catch(Exception e)
        {
            System.out.println(" parent exception occure ");
        }
        
        System.out.println(" rest of the code");
    }
    
}
