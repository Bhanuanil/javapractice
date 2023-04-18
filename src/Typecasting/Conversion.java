package Typecasting;

public class Conversion {
 public static void main(String[] args) {
    // convert sting to integer
    System.out.println("convert sting to integer");
    String s="123";
    int i= Integer.parseInt(s);
    System.out.println(i+450);
    int i1= Integer.valueOf(s);
    System.out.println(i1+100);
    //convert integer to string
    System.out.println("convert integer to string");
    int i2= 1232;
    String s1= String.valueOf(i2+90);
    System.err.println(s1+23);
    String s2=String.format("%d",i2);
    System.out.println(s2+100);
    String s3= Integer.toString(i2);
    System.out.println(s3);

    //convert String to long
     System.out.println("convert String to long");
    String s5="1234";
    Long l=Long.parseLong(s5);
    System.out.println(l);
    Long l1 = Long.valueOf(s5);
    System.out.println(l1+45);

  //convert long to string
  System.out.println("convert long to string");
    long  l2= 1234;
    String s4=String.valueOf(l2);
    System.out.println(s4);

    // convert String to float
    System.out.println("convert String to float");
    String s7= "123.4";
    Float f= Float.parseFloat(s7);
    Float f1 = Float.valueOf(s7);
    System.out.println(f);
    System.out.println(f1);
    //Convert float to String
    System.out.println("Convert float to String");
    float f3=125.89f;
    String ss= String.valueOf(f3);
    System.out.println(ss);
    //String to double
    System.out.println("String to double");
    String sr="1232.8";
    double d2=Double.valueOf(sr);
    System.out.println(d2);
    Double d3=Double.parseDouble(sr);
    System.out.println(d3);
    //double to string
    System.out.println("double to string");
    double d1= 2132382.3;
    String ss1= String.valueOf(d1);
    System.out.println(ss1);
    //String to char
    System.out.println("String to char");
    String ss3= "abc";
    Character c = ss3.charAt(1);
    System.out.println(c);
    //Char to string
    System.out.println("Char to string");
    char c1='B';
    String s9= String.valueOf(c1);
    System.out.println(s9);
    
 }
    
}
