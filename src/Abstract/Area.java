package Abstract;

public class Area  extends Shape{

    @Override
    void RectangleArea(double lenght, double width) {
        System.out.printf("Rectangle area = " +lenght*width);
        System.out.println("");
        
    }

    @Override
    void SquareArea(double side) {
        System.out.printf("Square area = " + side*side );
        System.out.println("");
        }

    @Override
    void CircleArea(double radius) {
        System.out.printf("Circle area = " + radius*radius);
        System.out.println("");
        
    }
    public static void main(String[] args) {
        Area aobj = new Area();
        aobj.RectangleArea(3, 6);
        aobj.CircleArea(2);
        aobj.SquareArea(4);
    }
    
}
