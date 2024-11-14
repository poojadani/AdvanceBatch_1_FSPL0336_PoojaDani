
class Grandparent {
    void message1() {
        System.out.println("Grandparent class");
    }
}

class Parent1 extends Grandparent {
    void show1() {
        System.out.println("Parent class");
    }
}

class Child1 extends Parent1 {
    void display() {
        System.out.println("Child class");
    }
}

public class MultilevelInheritance {
    public static void main(String[] args) {
        Child1 obj1 = new Child1();
        obj1.message1();  // Grandparent class method
        obj1.show1();     // Parent class method
        obj1.display();  // Child class method
    }
}

