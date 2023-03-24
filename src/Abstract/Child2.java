package Abstract;

public class Child2  extends Parent1{
    void message()
    { System.out.println(" This is second subclass");}
    public static void main(String[] args) {
        Child2 C2obj = new Child2();
        C2obj.message();
    }
    
}
