public class Methoddemo {
    public static void main(String[] args) {
        Methoddemo insobj=new Methoddemo();
        int s=insobj.sumOf(12,23);
        System.out.println(" the added value " +s);
        insobj.display();
        String Name = insobj.myString("Bhanu");
        System.out.println(" My name is " +Name);
        Methoddemo.myStaticmethod();
    }
    
        int  sumOf(int a, int b)
        {
         int s =a+b;
         System.out.println(" the sum value ");
         return s;
        }
    
        void display()
        {
            System.out.println(" bydefault declare");
        }

        String myString( String name )
        {
            System.out.println( " my name is ");
            return  name ;
        }
        static void  myStaticmethod()
        {
            System.out.println(" my static value");
        }
        


    
}
