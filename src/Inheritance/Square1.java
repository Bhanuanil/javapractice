package Inheritance;

public class Square1 extends Rectangle1 {
    void square1()
    {
        System.out.println(" Square is a rectangle");
    }
    public static void main(String[] args) {
        Square1 sqobj = new Square1();
        sqobj.shape();
        sqobj.Rectangle();
    }
    
}
