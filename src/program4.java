import java.util.Scanner;

//4.	Java Program to Check Whether a Number is Even or Odd
public class program4 {
    public static void main(String[] args) {
        Scanner scanerobj= new Scanner(System.in);
        System.out.println(" Enter the number");
        int i=scanerobj.nextInt();
        if(i%2==0)
        {
            System.out.println("Number is Even =" +i);
        }
        else
        {
            System.out.println(" Number is odd =" +i);
        }
        scanerobj.close();
    }
    
}
