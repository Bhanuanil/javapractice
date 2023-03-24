package String;
//20.	Java Program to Check if a string contains a substring using indexOf()
public class Program20 {
    public static void main(String[] args) {
        String str= " This is a program";
        String str1 ="program";
        String str2 ="Programing";
        System.out.println(str.length());
        int result = str.indexOf(str1);
        System.out.println(+result);
        if (result==-1)
        {
            System.out.println(str1 + " string is not  contain in substring ");
        }
        else
        {
            System.out.println(str1 + " string is contain in substring ");
        }
        int result1 = str.indexOf(str2);
        System.out.println(+result1);
        if (result1==-1)
        {
            System.out.println(str2 + " string is not  contain in substring ");
        }
        else
        {
            System.out.println(str2 + " string is contain in substring ");
        }

        
    }
    
}
