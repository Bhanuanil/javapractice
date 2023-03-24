package String;
//•	Java Program to remove all the white spaces from a string
public class Program30 {
    public static void main(String[] args) {
        String str="Java Program to remove all the white spaces from a string";
          //Removes the white spaces using regex    
          str = str.replaceAll("\\s+", "");    
        System.out.println(str);
    }
    
}
