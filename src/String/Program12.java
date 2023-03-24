package String;
//12.	Java Program to  to Clear the StringBuffer
public class Program12 {
    
    public static void main(String[] args) {
        StringBuffer str = new StringBuffer();
        str.append(" Java program to clear");
        System.out.println(str);
        // to Clear the StringBuffer using delete method 
        str.delete(0, str.length());
        System.out.println(" After to Clear the StringBuffer" +str);
    }
}
