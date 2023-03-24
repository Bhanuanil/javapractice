package String;
//7.	Java Program to Compare String objects using ==
public class Program7 {
    public static void main(String[] args) {
        String str = new String(" Java Program ");
        String str1 = new String(" Java Program ");
        System.out.println(str==str1); // it compare the reference not the value
    }
    
}
