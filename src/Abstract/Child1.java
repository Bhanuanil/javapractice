package Abstract;
public class Child1 extends Parent1 {
    
    void message()
    { System.out.println(" This is first  SubClass ");}
    
    public static void main(String[] args) {
        Child1 cobj = new Child1();
        cobj.message();
        
    }
    
}
