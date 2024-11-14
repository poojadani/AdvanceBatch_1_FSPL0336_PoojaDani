class Animals
{
    void sound()
    {
        System.out.println("This is Base  class Sound method");
    }
}
class Dogs extends Animals
{
    @Override
    void sound()
    {
        System.out.println("Barking");
    }
}
class Cats extends Animals
{
    @Override
    void sound()
    {
        System.out.println("Meaw Meaw");
    }
}
public class SingleInheritanceEX1
{
    public static void main(String[] args)
    {
        Animals a= new Animals();
        a.sound();
        Dogs d= new Dogs();
        d.sound();
        Cats c = new Cats();
        c.sound();

    }
}
