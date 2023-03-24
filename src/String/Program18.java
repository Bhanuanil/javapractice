package String;
//18.	Java Program to Iterate through each characters of the string – using for-each loop
public class Program18 {
    public static void main(String[] args) {

        // create a string
        String name = "Programiz";
    
        System.out.println("Characters in string \"" + name + "\":");
    
        // loop through each element using for-each loop
        for(char c : name.toCharArray()) {
    
          // access each character
          System.out.print(c + ", ");
        }
    
      }
    
}
