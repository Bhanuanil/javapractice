package Exception;
//3.	Java Program to Handle Exception Using Throw KeyWord
public class Program3Throw {
    static void  valiDate(int age)
    {
        if(age<18)
        {
            throw new ArithmeticException(" person is not eligible to vote ");
        }else
        {
            System.out.println(" person is eligible to vote");
        }
    }
    public static void main(String[] args) {
        valiDate(12);
        System.out.println(" rest of the code");
    }
}
