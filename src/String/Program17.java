package String;
//17.	Java Program to Iterate through each characters of the string – using for loop
public class Program17 {
    public static void main(String[] args) 
    {
    
            String str ="Iterate through";
            System.out.println("Characters in " + str + " are:");

            // using simple for-loop
            for (int i = 0; i < str .length(); i++)
             {
               // char a = str.charAt(i);
                System.out.print(str.charAt(i)+" , ");
             }
    }
    
}
