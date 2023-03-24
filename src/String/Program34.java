package String;
//•	Java Program to determine whether one string is a rotation of another
public class Program34 {
    public static boolean checkRotation(String st1,String st2)
    {
        if (st1.length()!=st2.length())
        { return false;}  
        String st3=st1+st2;
        if(st3.contains(st2))
    
            return true;
        else
         return false;

    }
    public static void main(String[] args) {
        String str1 = "avajava";  
        String str2 = "javaava";  
        System.out.println("Checking if a string is rotation of another");
     if(checkRotation(str1,str2))
    {
    System.out.println("yes "+ str2 +" is rotation of "+str1);
    }
    else
    {
        System.out.println("yes "+ str2 +" is not rotation of "+str1);
    }
    }


    
}
