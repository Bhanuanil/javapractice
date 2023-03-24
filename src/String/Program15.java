package String;
//15.	Java Program to Capitalize the first character of each word in a String
public class Program15 {
    public static void main(String[] args) {
        String str = "java  ";
        // create two substrings from name
    // first substring contains first letter of name
    // second substring contains remaining letters
    System.out.println(str.length());
    String firstLetter = str.substring(0, 1);
    String remainingLetters = str.substring(1, str.length());

    // change the first letter to uppercase
    firstLetter = firstLetter.toUpperCase();

    // join the two substrings
    str = firstLetter + remainingLetters;
    System.out.println(str);

        System.out.println(str.toUpperCase(null));
        
    }
    
}
