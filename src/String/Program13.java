package String;
//13.	Java Program to Clear the StringBuffer using setLength() method
public class Program13 {
    public static void main(String[] args) 
    {
    StringBuffer str = new StringBuffer(" hello");
    str.append(" java ");
    System.out.println(str);
    // Clear the StringBuffer using setLength() method
    str.setLength(0);
    System.out.println("Aftre clear string buffer" +str);
    }
}
