abstract  class Vehicle
{
    abstract void startEngine();
    abstract void stopEngine();
}
class Car extends  Vehicle
{
    void startEngine()
    {
        System.out.println("This startEngine method of car class");
    }
    void stopEngine()
    {
        System.out.println("This stopEngine method of car class");
    }
}
class Bike extends  Vehicle
{
    void startEngine()
    {
        System.out.println("This startEngine method of bike class");
    }
    void stopEngine()
    {
        System.out.println("This stopEngine method of bike class");
    }
}
public class AbstractClass_Vehicle
{
    public static void main(String[] args)
    {
        Car c= new Car();
        c.startEngine();
        c.stopEngine();

        Bike b= new Bike();
        b.startEngine();
        b.stopEngine();
    }
}
