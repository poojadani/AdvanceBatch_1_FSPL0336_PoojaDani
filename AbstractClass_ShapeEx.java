abstract class Shape
{
    abstract void calculateArea();
}
class Circle extends Shape
{
    double radius;
    final double PI = 3.14;

    public Circle(double radius)
    {
        this.radius = radius;
    }

    void calculateArea()
    {
        System.out.println("Area of circle is: " + PI * radius * radius);
    }
}

class Rectangle extends Shape
{
    double length, breadth;
    public Rectangle(double length, double breadth)
    {
        this.length = length;
        this.breadth = breadth;
    }
    void calculateArea()
    {
        System.out.println("Area of circle is: " + length * breadth);
    }
}
public class AbstractClass_ShapeEx
{
    public static void main(String[] args)
    {
        Circle c = new Circle(5);
        c.calculateArea();

        Rectangle r = new Rectangle(5, 4);
        r.calculateArea();
    }
}
/*OUTPUT
Area of circle is: 78.5
Area of circle is: 20.0

 */