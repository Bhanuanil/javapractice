package Inheritance;

public class Square extends Rectangle {

    public Square(int s) {
        super(s , s);
        
    }
    public static void main(String[] args) {
        Square sqobj = new Square(4);
        sqobj.area();
        sqobj.perimeter();
    }
}
