package NestedClass;

public class MethodLocalClasses {
    public static void main(String[] args) {
        MethodLocalClasses mobj = new MethodLocalClasses();
        mobj.Display();
        MethodLocalClasses.myStaticMethod();
        mobj.interMetohd();
        MethodLocalClasses.TextInterface txObj = mobj.new TextInterface();
        txObj.aDisplay();
        txObj.textDisplay();
    
    }
    int i=76;
    String Name= " Chakri ";
    void Display()
    {
        System.out.println(" In  local method");
        int l=90; // without intializing we can not access local variable
        // local method class or method local inner class
       abstract  class LocalInnerClass
        {
            int k=90;
            static int j=89;
            void localDisplay()
            {
                System.out.println(" In local inner Display method " +k+" "+l+ " "+i+ " "+LocalInnerClass.j);
            }
            static void staticMethod()
            {
                System.out.println(" This is static method ");
            }
            abstract void abstractMethod();
        }
        LocalInnerClass lobj = new LocalInnerClass(){

            @Override
            void abstractMethod() {
                // TODO Auto-generated method stub   
            }
        }; //anonymous inner class we abstract to calss
        lobj.localDisplay();
        LocalInnerClass.staticMethod();
    }
    static void myStaticMethod()
    {
        System.out.println(" in static method");
        class StaticInnerClass{
            int h=45;
            void staticDisplay()
            {
                System.out.println(" in static inner calss method");
            }

        }
        StaticInnerClass sobj = new StaticInnerClass();
        sobj.staticDisplay();

    }
    
    MethodLocalClasses()
    {
        System.out.println(" In constructor ");
    }
    // for interface class
    void interMetohd()
    {
        System.out.println(" Inter method ");
        //interface class
        interface InterfaceClass {
            int g=90;
            default void interDisplay()
            {
                System.out.println(" In interface class");
            }
        }
        InterfaceClass iobj = new InterfaceClass()
        { };
        iobj.interDisplay();  
    }
    interface A
    {
        void aDisplay1();

        default void aDisplay()
        {
            System.out.println(" this is inteface class a");
            interface B
            {
                default void bDisplay()
                {
                    System.out.println(" This is interface B class");
                }
            }
            B bObj = new B() {   
            };
            bObj.bDisplay();
        }
        interface Chakri{
            void cDisplay();

        }
    }
    class TextInterface implements A,A.Chakri
    {
        void textDisplay()
        {
            System.out.println(" Inheritance of text ");
        }  
        public void aDisplay1()
        {
            
        }  
        public void cDisplay()
        {

        }  
    }
}
