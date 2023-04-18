package Exception;

public class Program19ClassCast {
    
        public void eat(String str) {
            System.out.println("IN program19");
        }
    class Pro1 extends Program19ClassCast {
        public void eat(String str) {
            System.out.println("In pro1");
        }
    }
    class Another extends Pro1{
      public void eat(String str) {
            System.out.println(" In another");
      }
    }
    
    public class InheritanceSample {
        public static void main(String[] args) {
            Program19ClassCast a = new Program19ClassCast();
            Another t5 = (Another) new Program19ClassCast();
        }
    }
}
/*Be careful when trying to cast an object of a class into 
another class. Ensure that the new type belongs to one of 
its parent classes.
You can prevent the ClassCastException by using Generics, because Generics provide compile time checks and can be used to 
develop type-safe applications. */