package String;
/*1.	Java Program to Count the Number of Vowels, digits, spaces and Consonants in a Sentence */
public class Program1 {
    public static void main(String[] args) {
        String Str = new String();
        String Str1="This is java program for count method 233 453";
        int vowels = 0, digits = 0, spaces = 0 ,consonants = 0;

    Str1 =Str1 .toLowerCase();
    System.out.println(Str1);
    for (int i = 0; i < Str1.length(); ++i)
     {
      char ch = Str1.charAt(i);

      // character is any of a, e, i, o, u
      if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') 
      {
        ++vowels;
      }
      //  digit is in between 0 to 9
      else if (ch >= '0' && ch <= '9')
       {
        ++digits;
       }
      
      //  character is a white space
      else if (ch == ' ') 
      {
        ++spaces;
      }
      // check if character is in between a to z
      else if ((ch >= 'a' && ch <= 'z')) 
      {
        ++consonants;
      }
      
    }

    System.out.println("Vowels: " + vowels);
    System.out.println("Digits: " + digits);
    System.out.println("White spaces: " + spaces);
    System.out.println("Consonants: " + consonants); 
  }
 }
    

