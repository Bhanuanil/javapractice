package Exception;
//8.	Java Program to Use Handle the Exception With Overloaded Methods
public class Program8Overload {
    double methodD(int i )throws Exception
    {
        return i/0;
    }
    boolean methodD(boolean b)
    {
        return !b;  
    }
    static double methodD(int x, double y)throws Exception
    {
        return x+y;
    }
    static double methodD(double x, double y)
    {
        return x+y-3;
    }
    public static void main(String[] args) {
        Program8Overload obj = new Program8Overload();
        try{
            System.out.println(methodD(10,20));
            System.err.println(methodD(10.0,20 ));
            System.out.println(methodD(10.0,20.0));
            System.out.println(obj.methodD(10));
            System.out.println(obj.methodD(false));
        }catch(Exception e)
        {
            System.out.println(" exception occure " +e);
            System.out.println(" exception occure " +e);
        }
        
    }
    
}
