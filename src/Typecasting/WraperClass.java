package Typecasting;

public class WraperClass {
    public static void main(String[] args) {
    
    int i= 200;
    float f= 20.6f;
    double d=200.0;
    long l= 2010;
    byte b= 123;
    short s= 12;
    char c='A';
   boolean bo=true;
    //autoboxing 
    Byte b1= b;
    Short s1=s;
    Long l1 = l;
    Float f1 = f;
    Double d1 = d;
    Character ch = c;
    Boolean bo1=bo;
    System.out.println(" byte " +b1);
    System.out.println("Short " +s1);
    System.out.println("Long " +l1);
    System.out.println("Float "+ f1);
    System.out.println("Character "+ch);
    System.out.println("Boolean" + bo1);
    value(i);
    value(i);
 int i2 = 200;
  Integer i1=i2;
    getValue(i1);
    getValue(i1);

    }
    public static void value(int i)
    {
        System.out.println(" value is " +i+100);
    }
    public static void myvalue(Integer i)// boxing
    {
        System.out.println("  my value is " +i+100);
    }
    public static void getValue(int i1)//unboxing
    {
        System.err.println(i1);

    }
    public static void getValue(Integer i1)
    {
        System.err.println(i1);
        
    }
   

    
}
