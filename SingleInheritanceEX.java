class Animal
{
    void sound()
    {
        System.out.println("This is Base  class Sound method");
    }
}
class Dog extends Animal
{
    @Override
    void sound()
    {
        System.out.println("Barking");
    }
}
class Cat extends Animal
{
    @Override
    void sound()
    {
        System.out.println("Meaw Meaw");
    }
}
public class SingleInheritanceEX
{
    public static void main(String[] args)
    {
        Animal a= new Animal();
        a.sound();
        Dog d= new Dog();
        d.sound();
        Cat c = new Cat();
        c.sound();

    }
}
