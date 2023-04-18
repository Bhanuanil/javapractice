package Typecasting;
interface Greandparent{
   public void grandParent();
}
class Child1 implements Greandparent
{
    public void grandParent() {
        System.out.println(" in grandparent ");
    }
    public void childA()
     {
        System.out.println(" in child method ");
     }
}
public class ReferenceInterface {
    public static void main(String[] args) {
        Child1 c1= new Child1();
        c1.childA();
        Greandparent gp=c1; //upcasting it done implicitly
       gp.grandParent();
       
     }
}