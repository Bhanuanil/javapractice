package String;

import java.util.Random;

import javax.swing.plaf.basic.BasicBorders.RadioButtonBorder;

//11.	Java Program to Create random alphanumeric string(string builder)
public class Program11 {
    public static void main(String[] args) 
    {
    String Uppercase= "ABCDEFGHIJKLMNOPQR";
    String Lowercase = " abcdefghijklmnopqrstuvwxyz";
    String number =" 1234567890";
     // call all string in one 
     String  AlphaNumaeric =Uppercase+Lowercase+number;
     StringBuilder strbuilder = new StringBuilder();
     Random random = new Random();
     // specify length of random string
    int length = 10;

    for(int i = 0; i <= length; i++)
    {
        int index = random.nextInt(AlphaNumaeric.length());/* nextInt(int bound) method accepts
         a parameter bound (upper) that must be positive. 
        It generates a random number in the range 0 to bound-1. */
         // get character specified by index
      // from the string
         char randomChar = AlphaNumaeric.charAt(index);
         strbuilder.append(AlphaNumaeric);
         //System.out.println(strbuilder);
    }
    String randomString =strbuilder.toString();
    System.out.println("Random alphanumeric string(string builder) is " +randomString);
    }
}
