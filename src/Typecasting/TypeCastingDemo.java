package Typecasting;

public class TypeCastingDemo {
    public static void main(String[] args) {
        int a=10;
        float b=20.7f;
        double d= b;
        b=a;//automatic type convesion,implicit,widening
        a=(int)b;
        b=(float)d;//float)d it is type casting fouble
        System.out.println(b);
        System.out.println(a);
        System.out.println(b);
        double k=d*a+b;
        int R=(int)(d*a+b);
        byte b1=20;
        byte b2=30;
        byte b3=(byte)(b1+b2);//default data type is integer

        int i=100;
        double d1 = i;//auto widening
        Double d2=d1;//Auto boxing convert to primitive to wrapper object
        System.out.println(d2);
       // Double d2 =i casting only primitive type 
         display(i);// primitive /widening/wraped class/Number upcasting  /error
    }
     static void display(int i)
     {
        System.out.println(" In Integer datatype " +i);
     }
     static void display(Integer i)
     {
        System.out.println("In Integer derived class "+ i);
     }
     static void display(float i)
     {
        System.out.println(" In widening " +i);
     }
}
