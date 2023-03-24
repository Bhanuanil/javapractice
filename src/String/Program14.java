package String;
//14.	Java Program to Clear the StringBuffer by creating a new object
public class Program14 {
    public static void main(String[] args) {
        StringBuffer str = new StringBuffer();
        str.append(" java program ");
        System.out.println(str);
        // clear string buffer using new object
        str = new StringBuffer();
        System.out.println(" Clear the StringBuffer by creating a new object ---" +str);
    }

}
