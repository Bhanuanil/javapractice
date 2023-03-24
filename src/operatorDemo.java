public class operatorDemo {
    public static void main(String[] args) {
        int i=20, j=10;
        System.out.println(i++);
        System.out.println(i);
        System.out.println(++j);
        System.out.println(j);
        System.out.println(i--);
        System.out.println(i);
        System.out.println(--j);
        System.out.println(j);
        int a=10;
        //int b=10;
        System.out.println(~a);
        int b=-10;
        System.out.println(~b);
         boolean b1=true;
         System.out.println(!b1);
        int c=10;
         System.out.println(++a + a++); // a=10 11 + 11 =22
         System.out.println(c++ + ++c); // c=10 10 + 12 =22
         System.out.println(c);

         a=21;
         b=31;
         System.out.println(a + b);
         System.out.println(a - b); 
         System.out.println(a * b);
         System.out.println(a / b);
         System.out.println(a % b);
         System.out.println(10<<3); // n<<m = n*2^m = 10*2^3= 10 * 2*2*2= 10*8=80
         System.out.println(10>>3); //n>>>m = n/2^m = 10/2^3= 10/8= 1

         // logical operator
         a=20;
         b=15;
         System.out.println(a>b && a<b); //true false if both the case true then it will give true otherwise false
         System.out.println(a>b || b>a);
         // bitwise operator
         System.out.println(a<b & a>b);
         // Ternary operator it operate with 2 operands sysmbols ? : ;
         //Assingment operator  =
         a +=10; // a= a+10;
         b -=10; // b= b-10;

         // comarison oerator == , != , < ,> , <=, >=

    }   
    
}
