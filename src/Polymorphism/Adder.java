package Polymorphism;

public class Adder {
    // method overloading changing number of argument
    static   int add(int a , int b)
    {return(a+b); }
    static int add(int a, int b, int c)
    { return (a+b+c);}
    // method overloading changing data type
    static double add(double a, double b)
    {return(a+b);}
    //operator overlading to add integer , to cocatenate string
    static void operator(int a,int b)
    {System.out.println(a+b); }
    static void operator(String s, String k)
    { System.out.println(s+k);}
    // method overloading and data type promotion
    void sum(int a, long b)
    { System.out.println(a+b);}
    void sum(int a, int b, int c)
    { System.out.println(a+b+c);}
    // method overloading with type promotion
    void sum(int a, int d)
    { System.out.println(" Integer arg method will be invoke ");}
    void sum(long a, long b)
    {
        System.out.println(" long arg methhod will be invoke ");
    }
   public static void main(String[] args) {
    System.out.println(Adder.add(11,11));
    System.out.println(Adder.add(12,23,24));
    System.err.println(Adder.add(2344,124324 ));
    Adder.operator(11,23 );
    Adder.operator("Bhanu", " priya");
    Adder obj1 = new Adder();
    obj1.sum(12,43554l );
    obj1.sum(11, 23, 34);
    obj1.sum(12, 23);
   } 
}
