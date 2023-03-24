/*Create a class to print an integer and a character with two methods
 having the same name but different sequence of the integer and the character parameters.
For example, if the parameters of the first method are of the form (int n, char c),
 then that of the second method will be of the form (char c, int n).*/


package Method;

public class Print {

    void printE ( int n, char c)
    {
        System.out.println(" Integer value  is  " +n+ " Character value  is " +c);
    }
    void printE( char c,int n)
    {
        System.out.println(" Character value is " +c+ " Integer value is " + n);
    }
    public static void main(String[] args) {
        Print pmobj = new Print();
        pmobj.printE(1, 'A');
        pmobj.printE('B',2);
    }
    
}
