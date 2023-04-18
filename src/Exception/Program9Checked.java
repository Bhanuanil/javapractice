package Exception;
import java.io.*;
import java.util.*;
public class Program9Checked {
    public static void main(String[] args) {
            FileInputStream program9Exception = null;
            try{
               program9Exception = new FileInputStream("Program8Overload.java");
               //throw new FileNotFoundException(); 
            }
               catch (FileNotFoundException e) {
 
            // Display message when exception occurs
            System.out.println("File does not exist");
        }
    }
}   

