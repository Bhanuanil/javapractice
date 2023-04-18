package Exception;

import java.io.File;

public class Program18IlligalArgument {
    public static String createRelative(String Parent, String Filename )
    {
        if(Parent== null)
        throw new IllegalArgumentException("The parent path cannot be null!");
        if(Filename== null)
        throw new IllegalArgumentException("The filename path cannot be null!");
        return Parent + File.separator + Filename;
    }
   public static void main(String[] args) {
    System.out.println( Program18IlligalArgument.createRelative("dir1", "file1"));
        System.out.println();
    System.out.println( Program18IlligalArgument.createRelative(null,"File2"));   
   } 
}
