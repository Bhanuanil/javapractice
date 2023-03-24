public class SubClass extends ParentClass{
    int i=24;
    void newDisplay()
    {
        System.out.println(" In  Sub class");

    }
    public static void main(String[] args) {
        SubClass subobj = new SubClass();
        subobj.newDisplay();
        subobj.GrandDisplay();
        System.out.println(subobj.k+ " "+ subobj.name);
    }

    
}
