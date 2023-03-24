import java.util.Scanner;
import java.util.InputMismatchException;
//
//import java.util.regex.Pattern;
public class inputoutputscanner {
    public static void main(String[] args) {

        Scanner scannerobj =new Scanner(System.in);
        
        //scannerobj.useDelimiter("%"); this is used to give % symbol insted to press enter until we % it will take vaue
        //System.out.println(scannerobj.delimiter());

        System.out.println("Enter the value ");
        int i= scannerobj.nextInt();
        System.out.println(" Enter some sentence");
        scannerobj.nextLine();// this is used to give next line without gving this we can not go to next line 
        String s1=scannerobj.nextLine();
        boolean t= scannerobj.nextBoolean();
        String s=scannerobj.next();
        System.out.println(" output :"+s);
         //scannerobj.findInLine("findl");
         String Str=" hello world";
         System.out.println("outpt" +scannerobj.findInLine("ello"));
         
         System.out.println(" left string:" +scannerobj.nextLine( ));
    
        System.out.println(" My input value is " +i+ "  " +t+ " " +s+ " "+s1);
        System.out.println(" Enter the input =");
        int k=scannerobj.nextInt();
        
        if (k%2==0)
       {
        System.out.println(k+ " is even number ");
       }
       else 
       {
        System.out.println(k+ " is odd number");
       }
       
       try{
        System.out.println(" Enter the value : ");
        int j=scannerobj.nextInt();
        System.out.println("input int" +j);
       }
       catch(InputMismatchException ex )
       {
        System.out.println(" enter number value not  a string" );
       }
       
      

       scannerobj.close();
    }

    
}
