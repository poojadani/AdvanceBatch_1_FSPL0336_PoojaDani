class Person
{
    private String name;
    private int age;
    private String city;

    public Person(){ }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }
    public void display(){
        System.out.println("Name :"+ name);
        System.out.println("Age :"+age);
        System.out.println("City :"+city);
    }
}

public class PersonDetails {
    public static void main(String[] args) {
        Person p = new Person();
        p.setName("Pooja Yogesh Patil");
        p.setAge(32);
        p.setCity("Jalgaon");
        p.display();
    }
}
/*OUTPUT
Name :Pooja Yogesh Patil
Age :32
City :Jalgaon
 */