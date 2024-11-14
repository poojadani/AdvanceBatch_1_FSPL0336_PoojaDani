class Parent {
    void showMessage() {
        System.out.println("Parent Class");
    }

}

class Child extends Parent {
    void display() {
        System.out.println("Child Class");
    }
}

public class SingleInheritance {

    public static void main(String[] args) {
        Child obj = new Child();
        obj.showMessage();  // Parent class method
        obj.display();      // Child class method
    }

}
