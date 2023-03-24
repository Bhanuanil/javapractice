package String;
//19.	Java Program to Check if a string contains a substring using contains()
public class Program19 {
    public static void main(String[] args) {
        String Str = " This is program";
        String Str1 = " program";
        boolean result = Str.contains(Str1);
        if(result)
        {
            System.out.println(Str1+ " String contain str ");
        }
    
        else
        {
            System.out.println(Str1+ " String not contain str");
        }
        boolean result1 = Str1.contains(Str);
        if(result1)
        {
            System.out.println(Str+ " String contain str1 ");
        }
    
        else
        {
            System.out.println(Str+ " String not contain str1");
        }
        }
    
}
