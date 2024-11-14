class Parents {
    void showMessage() {
        System.out.println("Parent Class");
    }
}

class Child_1 extends Parents {
    void display() {
        System.out.println("Child_1 Class");
    }
}

class Child2 extends Parents {
    void display() {
        System.out.println("child_2 Class");
    }
}

public class HierarchicalInheritance {

    public static void main(String[] args) {
        Child_1 c = new Child_1();
        Child2 obj2 = new Child2();
        c.showMessage();
        c.display();
        obj2.showMessage();
        obj2.display();
    }
}

