package String;

import java.util.Random;

//10.	Java Program to Create random strings(string builder)
public class Program10 {
    public static void main(String[] args) {
        String str= "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        // create string builder
        StringBuilder strobj = new StringBuilder();
        // create an object of Random class
        Random ra = new Random();
        // specify the length 
        int length=8;
        int i;
        for(i=0;i<length;i++)
        {
            // genrate random index length
            int index = ra.nextInt(str.length());
            // get character specified by index
             // from the string
            char randomChar = str.charAt(index);
    
           // append the character to string builder
           strobj.append(randomChar);
        }
        String randomString = strobj.toString();
    System.out.println("Random String is: " + randomString);
    }
    
}
