package Exception;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
//import java.io.IOException;

public class TryWithResources {
    public static void main(String[] args) {
        try(FileOutputStream fl = new FileOutputStream("Abc.java"))
        {
            String str=" Welcome to TryWithResources";
            byte arr[]= str.getBytes(); //cnvert the string into array
            fl.write(arr);
            System.out.println(" Message written to file succesfully");
        }
        catch(Exception i)
        {
            System.out.println(i);
        }
        
    }
    
}
