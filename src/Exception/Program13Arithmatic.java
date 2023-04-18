package Exception;

import java.math.BigDecimal;

//13.	Java Program to Handle Arithmetic Exception
public class Program13Arithmatic {
    public static void main(String[] args) {
        // creating two objects of BigDecimal  
      BigDecimal a1 = new BigDecimal(11);  
       BigDecimal a2 = new BigDecimal(17);  
       try{
        a1=a1.divide(a2);
        System.out.println(a1.toString());
       }catch(ArithmeticException e)
       {
        System.out.println("Should avoid dividing by an integer that leads to non-terminating decimal expansion. " +e);
       }
    }
    
}
