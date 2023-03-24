package Exception;

import java.io.IOException;

public class OveridingException {
    void display()
    {

    }
    void otherDisplay() throws IOException
    {

    }
}
 class Child extends OveridingException 
 { 
    void display() throws ArithmeticException // it can not throw checked exception it can throw checked exception
    {

    }
    void otherDisplay() throws IOException // if parent throws exception there is no need to throw child also
    {

    }
 }
