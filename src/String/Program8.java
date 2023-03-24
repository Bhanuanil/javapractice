package String;
//8.	Java Program to Check if a String is Numeric 
public class Program8 {
    public static void main(String[] args) {
        String str = "2387263";
        boolean Number = true ;
        boolean numeric=true;
        try //if the string contains numbers only, in the try block
        {
            Double Num= Double.parseDouble(str);//parsedouble method to convert the string to a Double
        }
        catch (NumberFormatException e)/*it means the string isn't a number and 
        /Number is set to false. Else, it's a number.
         numberformatexception occurs when an attempt is made to convert a 
        string with an incorrect format to a numeric value.*/
         {
            Number  = false;
         }
         if(Number)
            System.out.println(str + " is a number");
        else
            System.out.println(str + " is not a number");

        // Check if a string is numeric or not using regular expressions (regex)

        numeric = str.matches("-?\\d+(\\.\\d+)?");

        if(numeric)
        System.out.println(str + " is a number");
    else
        System.out.println(str + " is not a number");

    }       
}
/*In the matches() method,

-? allows zero or more - for negative numbers in the string.
\\d+ checks the string must have at least 1 or more numbers (\\d).
(\\.\\d+)? allows zero or more of the given pattern (\\.\\d+) in which
\\. checks if the string contains . (decimal points) or not
If yes, it should be followed by at least one or more number \\d+. */