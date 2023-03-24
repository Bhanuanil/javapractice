package Abstract;

public class NonAbstractClass extends Abstractclass {

    @Override
   void a_Method() {
        System.out.println( "This is abstract method");
    }
    void display()
    { System.out.println( "This is a normal method of abstract class");}
    public static void main(String[] args) {
        NonAbstractClass nobj = new NonAbstractClass();
        nobj.a_Method();
        nobj.display();

    }

    
}
