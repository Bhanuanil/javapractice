package String;
//6.	Java Program to Compare Strings using equals()
public class Program5 {
    public static void main(String[] args) {
        String str= new String(" Wellcome ");
        String str1= " Wellcome ";
        String str2= " Wellcome ";
        System.out.println(str1.equals(str2));// it check the it is same or not and case also
        System.out.println(str1.equals(str));// it will not check reference
    }
    
}
