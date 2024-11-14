public class TypeCastAssignmentConditionalOp {


    public static void main(String[] args) {

        AssignmentOperators();


        TypeCasting();


        ConditionalOperators();
    }


    private static void AssignmentOperators() {

        int a = 10;
        int b = 20;
        System.out.println("Initial values:");
        System.out.println("a = " + a);
        System.out.println("b = " + b);

        a += 5;
        System.out.println("\nAfter a += 5:");
        System.out.println("a = " + a);

        a -= 3;
        System.out.println("After a -= 3:");
        System.out.println("a = " + a);

        a *= 2;
        System.out.println("After a *= 2:");
        System.out.println("a = " + a);

        a /= 4;
        System.out.println("After a /= 4:");
        System.out.println("a = " + a);

        a %= 3;
        System.out.println("After a %= 3:");
        System.out.println("a = " + a);

        int x = 5;
        x <<= 2;
        System.out.println("After x <<= 2:");
        System.out.println("x = " + x);

        x = 20;
        x >>= 2;
        System.out.println("After x >>= 2:");
        System.out.println("x = " + x);

    }

    private static void TypeCasting() {
        int intValue = 10;
        double doubleValue = intValue;
        System.out.println("\nDouble value: " + doubleValue);

        long longValue = intValue;
        System.out.println("Long value: " + longValue);

        float floatValue = intValue;
        System.out.println("Float value: " + floatValue);

        doubleValue = 9.78;
        int intValueFromDouble = (int) doubleValue;
        System.out.println("Int value from double: " + intValueFromDouble);

        float floatValueFromDouble = (float) doubleValue;
        System.out.println("Float value from double: " + floatValueFromDouble);

        long longValueFromDouble = (long) doubleValue;
        System.out.println("Long value from double: " + longValueFromDouble);

        Animal animal = new Dog();
        if (animal instanceof Dog) {
            Dog dog = (Dog) animal;
            dog.bark();
        }
    }

    private static void ConditionalOperators() {
        int a = 10;
        int b = 20;

        int max = (a > b) ? a : b;
        System.out.println("\nThe maximum value is: " + max);

        int number = 15;
        String result = (number % 2 == 0) ? "Even" : "Odd";
        System.out.println("The number is: " + result);
    }

    static class Animal {
        void makeSound() {
            System.out.println("Animal sound");
        }
    }

    static class Dog extends Animal {
        void bark() {
            System.out.println("Woof");
        }
    }
}

/*OUTPUT
Initial values:
a = 10
b = 20

After a += 5:
a = 15
After a -= 3:
a = 12
After a *= 2:
a = 24
After a /= 4:
a = 6
After a %= 3:
a = 0
After x <<= 2:
x = 20
After x >>= 2:
x = 5

Double value: 10.0
Long value: 10
Float value: 10.0
Int value from double: 9
Float value from double: 9.78
Long value from double: 9
Woof

The maximum value is: 20
The number is: Odd                  */