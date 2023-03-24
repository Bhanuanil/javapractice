package Exception;

public class TryCatchExample {
    public static void main(String[] args) {
      /*   int a=50/0;
        System.out.println(" rest of code "); */
         // this give arithmatic exception after exception allcode will not execute
         try{ int a=50/0;
        }catch(ArithmeticException e)
        {
            System.out.println(e);
        }
        System.out.println(" Rest of the code");
    }
}
