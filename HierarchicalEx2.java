class GrandParents {
    void showMessage() {
        System.out.println("Grand Parents Class");
    }
}

class Parent_1 extends GrandParents {
    void display() {
        System.out.println("Parents  Class");
    }
}

class Child_11 extends GrandParents {
    void display() {
        System.out.println("Child  Class");
    }
}
public class HierarchicalEx2
{
    public static void main(String[] args) {
        Parent_1 c = new Parent_1();
        Child_11 obj2 = new Child_11();
        c.showMessage();
        c.display();
        obj2.showMessage();
        obj2.display();
    }
}

/*OUTPUT
 Grand Parents Class
 Parents  Class
 Grand Parents Class
 Child  Class
 */

