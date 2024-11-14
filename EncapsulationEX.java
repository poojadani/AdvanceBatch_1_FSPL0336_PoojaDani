class student {
    private String name;
    private int age;

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
}

public class EncapsulationEX {
    public static void main(String[] args) {
        // person object created
        student s1 = new student();
        s1.setName("POOJA");
        s1.setAge(32);

        // Using methods to get the values from the
        // variables
        System.out.println("Name: " + s1.getName());
        System.out.println("Age: " + s1.getAge());
    }
}

/*OUTPUT
Name: POOJA
Age: 32
 */