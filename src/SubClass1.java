public class SubClass1 extends ParentClass{
    int a=28;
     int k = 78;
     // method overriding- alrady exist in parent class we over ride here also. abd signature should be same.
    void GrandDisplay()
    {
        System.out.println(" in from Grandparent class");
        super.GrandDisplay();
       
    }
    // hiding
    static void display1() // we can not call this and super in static contest
    {
        System.out.println(" the display method from grand parent");
    }
    SubClass1()
        {
            //super(0); by default 
            super(56);
            System.out.println(" subclass constructor");
            System.out.println(k +" "+super.k);
        }
    
    public static void main(String[] args) {
        SubClass1 subobj = new SubClass1();
        subobj.parentDisplay();
        System.out.println(subobj.k);

    }
    
}
