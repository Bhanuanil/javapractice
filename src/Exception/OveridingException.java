package Exception;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;

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
    void otherDisplay()  throws IOException// if parent throws exception there is no need to throw child also
    {

    }
    public static void main(String[] args) {
        
    }
 }
