package NestedClass;

public class NestedClassDemo
{
    int i=89;
    String Name="Bhanu";
    private int  k=89;
    static int  x=35;
    void display()
    { 
        x=80;
        System.out.println(" IN Display method main class");
    }
     NestedClassDemo()
    {
         System.out.println(" In Constructor of main class");
    }
    class InnerClass //this is nested class inner class is act like member of main class
    {
        int j=90;
        void ptint()
         {
            System.out.println(" In print");
         }
        void innerDisplay()
        {
         i=36;
         Name=" hello ";
         x=90; // static member can access in inner calss
         
        display();// we can call method of outer class
            System.out.println(" This is innerClass method ");
            InnerClass inccObject = new InnerClass();
           inccObject.ptint();
        }
        InnerClass()
        {

            System.out.println(" This is constructor of inner class");
        }
        //InnerClass inccObject = new InnerClass();//we can create directly instance
        
        static void myStaticMethod() // 
        {
            System.out.println(" In main ");
            NestedClassDemo outObj = new NestedClassDemo();
            InnerClass innObj = outObj.new InnerClass();
            innObj.innerDisplay();
        }

        class DeepInnerClass
        {    
            void deepDisplay() 
            {
            display();
            }
        }
    }
    public static void main(String[] args) {
        NestedClassDemo nobj = new NestedClassDemo();
        InnerClass inobj = nobj.new InnerClass();
        inobj.innerDisplay();
        NestedClassDemo.InnerClass.DeepInnerClass dpObj= inobj.new DeepInnerClass();
        dpObj.deepDisplay();
    }
    
}
