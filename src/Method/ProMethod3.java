/*Create a class to print the area of a square and a rectangle. 
The class has two methods with the same name but different number of parameters.
The method for printing area of rectangle has two parameters which are length and breadth
respetively while the other method for printing 
area of square has one parameter which is side of square. */

package Method;
public class ProMethod3 {
    void methodArea( int length, int breadth)
    {
        System.out.println("Area of Rectangle is " +length*breadth);
    }
    void methodArea(int a)
    {
        System.out.println("Area of Square is " +a*a);
    }
    public static void main(String[] args) {
        ProMethod3 mobj= new ProMethod3();
        mobj.methodArea(4, 8);
        mobj.methodArea(3);
    }
}
