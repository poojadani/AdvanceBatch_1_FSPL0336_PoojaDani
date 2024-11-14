class Rectangles
{
    double length, width;
    public Rectangles(double length, double width)
    {
        this.length = length;
        this.width = width;
    }
    void calculateArea()
    {
        System.out.println("Area of circle is: " + length * width);
    }
    void calculate_Perimeter()
    {
        System.out.println("Perimeter of rectangle is : " +(length+width)*2);
    }
}
public class RectangleArea
{
    public static void main(String[] args) {
        Rectangles r = new Rectangles(5, 4);
        r.calculateArea();
        r.calculate_Perimeter();
    }
}
/*OUTPUT
Area of circle is: 20.0
Perimeter of rectangle is : 18.0
 */