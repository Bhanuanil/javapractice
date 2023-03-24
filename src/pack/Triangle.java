/*Write a program to print the area and perimeter of a triangle having sides of 3, 4 and 5 units by creating
 a class named 'Triangle' without any parameter in its constructor */
package pack;

public class Triangle {
   //int a , b, c;
   Double getArea(float b, float h)
   {
     double  area=(b*h)/2;
     return area;
   }
 int getParameter(int a, int b, int c)
    {
        int  parameter=(a+b+c);
         return parameter;
    }

    public static void main(String[] args) {
        Triangle t=new Triangle();
        double area=t.getArea(5, 2);
        System.out.println(" The area of triangle is " +area);

        int parameter=t.getParameter(3, 4,5);
        System.out.println(" The parameter of triangle is " +parameter);

        
    }
    
}
