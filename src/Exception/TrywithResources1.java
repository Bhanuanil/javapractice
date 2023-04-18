package Exception;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
//Using Multiple Resources
public class TrywithResources1 {
    public static void main(String[] args) 
    {
        try(FileOutputStream fileOutputStream = new FileOutputStream("Abc.java");
        InputStream input = new FileInputStream("Abc.java"))
        {
        String msg = " Welcome to javaTpoint";
        byte arr[]=msg.getBytes();
        fileOutputStream.write(arr);
        System.out.println(" -Data written into file");
        System.out.println(msg);
        DataInputStream input1 = new DataInputStream(input);    
        int data = input.available();    
        // Returns an estimate of the number of bytes that can be read from this input stream.   
        byte[] Arr = new byte[data]; //    
        input1.read(Arr);    
        String str = new String(Arr); // passing byte array into String constructor  
        System.out.println("-Data read from file--");  
        System.out.println(str); // display file data  
        }
        catch(Exception e)
        {  
       System.out.println(e);  
        }     
    }
    
}
