package Exception;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;

public class TryeithResourceswithFinally {
    public static void main(String[] args) {
        try(FileOutputStream fileOutputStream=new FileOutputStream("Abc.java");
        InputStream input = new FileInputStream("Abc.java"))
        {
            String msg=" Wellcome to TrywithResorces ";
            byte Arr[]=msg.getBytes();
            fileOutputStream.write(Arr);
            System.out.println("Write Data into file"); 
           }catch(Exception exception)
           {  
           System.out.println(exception);  
           }
             finally
            {
                System.out.println("Finally executes after closing of declared resources.");
            }       
        }
    }
    

