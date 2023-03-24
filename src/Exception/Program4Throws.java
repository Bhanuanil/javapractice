package Exception;

import java.io.IOException;

//4.	Java Program to Handle Exception Using Throws KeyWord
public class Program4Throws {
    void throwMethod()throws IOException
    {
        throw new IOException(" Device error");

    }
    public static void main(String[] args) {
        try{
            Program4Throws Obj = new Program4Throws();
            Obj.throwMethod();
        }catch(Exception e)
        {
            System.err.println("Exception handle");
        }
        System.out.println(" normal flow");
    }
}
