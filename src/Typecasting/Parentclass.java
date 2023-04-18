package Typecasting;
 class Parent
  {
    void display()
    {
        System.out.println(" In Pasrent class");
    }
  }
  interface Greandparent{
    public void grandParent();
  }
  class Child1 extends Parent 
  {
      void childA()
    {
       System.out.println(" In Child 1 class");
    }
    void display()
    {
        System.out.println(" In display method of child ");
    }

  }
  class Child2  extends Parent
  {
    void child2B()
    {
        System.out.println(" in child 2 method ");
    }
  }

public class Parentclass {
    public static void main(String[] args) {
        Child1 C1 = new Child1();
        C1.childA();
        C1.display();
        Parent p=C1;// it is upgreade cast it implicitly  done by compiler
        p.display();
        ((Child1)p).childA();// upcast  done explicitly 
        ((Child1)p).display();
        //child 2
        Child2 C2 = new Child2();
        Parent p2=C2;
       // ((Child1)p2).childA(); //downgrade the prent to child but there is no relation betn child1 child 2
          //to avoid this we use instanceof operator
        if(p instanceof Child2)
        {
            System.out.println(" p is not  instance of child2 ");
            ((Child2)p).child2B();
        }
        if(p2 instanceof Child2)
        {
            System.out.println(" p2 is instance of child2 ");
            display((Child2)p2);
        }
        else
        {
            System.out.println(" p2 is not instance of child2 ");
        }
    }
    static void display( Child2 p2)
    {
        System.out.println(" In parent display");
    }
}
