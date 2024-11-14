class point
{
    private int x ;
    private int y;

    //defualt constructor
   public point()
    {
        x = 0;
        y = 0;
    }
    //Parametrized constructor
    public point(int x,int y)
    {
        this.x=x;
        this.y=y;

    }

    //setter function
    void setPoint(int a, int b)
    {
        x = a;
        y = b;
    }
    //getter functions
    int getX()
    {
        return x;
    }
    int getY()
    {
        return y;
    }
}
public class PointEx {
    public static void main(String[] args) {
        //object
        point p1=new point();
        point p2= new point();
        point p3=new point(10,20);
        //set points
        p1.setPoint(5, 10);
        p2.setPoint(50, 100);

        //get points

        System.out.println("Point p1 is: "+p1.getX()+ ", "+p1.getY());
        System.out.println("Point p2 is: "+p2.getX()+ ", "+p2.getY());

        System.out.println("Point p3 is: "+p3.getX()+ ", "+p3.getY());

    }
}
/*OUTPUT
Point p1 is: 5, 10
Point p2 is: 50, 100
Point p3 is: 10, 20

 */