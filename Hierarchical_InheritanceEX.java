class Appliance
{
    void turnOn()
    {
        System.out.println("Turn on method from Appliances class");
    }
}
class Fan extends Appliance
{
    void turnOn()
    {
        System.out.println("Turn on method from Fan class");
    }
}
class AirConditioner extends Appliance
{
    void turnOn()
    {
        System.out.println("Turn on method from AirConditioner class");
    }
}
public class Hierarchical_InheritanceEX
{
    public static void main(String[] args)
    {
        Appliance a=new Appliance();
        a.turnOn();

        Fan f = new Fan();
        f.turnOn();

        AirConditioner ac = new AirConditioner();
        ac.turnOn();
    }
}
/*OUTPUT
Turn on method from Appliances class
Turn on method from Fan class
Turn on method from AirConditioner class
 */