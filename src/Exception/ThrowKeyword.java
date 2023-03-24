package Exception;

public class ThrowKeyword {
    static void valiDate(int age)
    {
        if(age<18)
        throw new ArithmeticException(" not valid ");
        else
        System.out.println(" welcome to vote");
    } 
    public static void main(String[] args) {
       valiDate(25);
       System.out.println(" rest of the code ");
    }
    
}
