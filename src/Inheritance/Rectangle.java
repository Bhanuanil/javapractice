package Inheritance;

public class Rectangle {
    int Length , Breadth;
    public Rectangle(int l, int b)
    {
         Length =l;
         Breadth =b;
    }
    void area()
    {
       int Area= Length*Breadth;
        System.out.println("Area of Rectangle " +Area);
    }
    void perimeter()
    {
        int perimeter=2*(Length+Breadth);
        System.out.println(" perimeter of Rectangle ="+perimeter);
    }
   
       public static void main(String[] args) 
    {
       Rectangle rectobj = new Rectangle(4,5);
        rectobj.area();
        rectobj.perimeter();
    }
}
