package Array;

import java.util.Arrays;

//Java Program to Convert Character to String and Vice-Versa
public class Program42 {
    public static void main(String[] args) {
        //Convert char to String
        char ch = 'c';
        String st = Character.toString(ch);
        // Alternatively
        // st = String.valueOf(ch);
        System.out.println("The string is: " + st);
        //Convert char array to String
        char[] ch1 = {'a', 'e', 'i', 'o', 'u'};

        String st1 = String.valueOf(ch1);
        String st2 = new String(ch1);
        System.out.println(st1);
        System.out.println(st2);
        //Convert String to char array
        String st3 = "This is great";
        char[] chars = st.toCharArray();
        System.out.println(Arrays.toString(chars));
    }
}
