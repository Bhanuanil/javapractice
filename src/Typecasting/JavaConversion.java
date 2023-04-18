package Typecasting;

public class JavaConversion {
    public static void main(String[] args) {
        String s="123";
        float f =Float.parseFloat(s); //string to float
        int i=Integer.parseInt(s);// every data type has class its called wraper class string to int
        Integer k;
        Float f1; 
        System.out.println(i+f);// it convert into int
        String s1="123";
        int a= Integer.valueOf(s1);//it convert into object of integer class
        System.out.println(a);
        // three ways to convert the integer to string
        s= String.valueOf(i);
        s = Integer.toString(i);
        s= String.format("%d", i);
        System.out.println(s);
        System.out.println(s+200);
        char c = 'a';
        s= String.valueOf(c); // char to string
        System.out.println(c);
        String s2="ABC";
        s2= Character.toString(c);//char to string
        System.out.println(s2);
        String s3="123";
        long l1=Long.parseLong(s3);//string to long
        System.out.println(l1);
        s3= String.valueOf(l1);//long to string
        System.out.println(s3);
        double d4=6475;
       // s3=Double.parseDouble(d4);

    
        
    }
    
}
