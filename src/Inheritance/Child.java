package Inheritance;

public class Child extends Parent1 {
    void display()
        {
          System.out.println(" This is child class");
        }
    
    public static void main(String[] args)
    {
        Child chiobj= new Child();
        chiobj.display();
        chiobj.parenDisplay();
        
    }
    
}
