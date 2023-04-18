package Exception;

import java.io.IOException;

public class ChainedException {
    public static void main(String[] args) {
        try{
            ArithmeticException e= new ArithmeticException();
       e.initCause(new IOException("This is actual cause of the exception"));
       throw e;
    }
    catch (Exception e) {
        System.out.println(e);
        System.out.println(e.getCause());
    }
}
}