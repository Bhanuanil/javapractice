package String;
//•	Java Program to swap two string variables without using third or temp variable.
public class Program44 {
     public static void main(String[] args) 
        {
        String a = "JAVA";  
        String b = "PROGRAM";  
        System.out.println("Before swap: " + a + " " + b);  
        a = a + b; 
        System.out.println(a); 
        b = a.substring(0, a.length() - b.length());  
        a = a.substring(b.length());  
        System.out.println("After : " + a + " " + b);  
        }  
}
