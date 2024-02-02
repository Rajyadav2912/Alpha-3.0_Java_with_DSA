
/*
 * POLYMORPHISM :- * Compile Time Polymorphism (Static Polymorphism)
 *                   - Method Overloading.....
 *                 *  Run Time Polymorphism (Dynamic Polymorphism) 
 *                   - Method Overriding......
 */

public class Polymorphism {
    public static void main(String[] args) {

        // - Method Overloading.....
        Calculator calc = new Calculator();
        System.out.println(calc.sum(5, 5));
        System.out.println(calc.sum(3, 5, 2));
        System.out.println(calc.sum((float) 5.5, (float) 4.5));

        System.out.println();

        // - Method Overriding......
        Deer d = new Deer();
        d.eat(); // Eats is grass...

        Animal a = new Animal();
        a.eat(); // Eats is anythings...
    }
}

// * Compile Time Polymorphism (Static Polymorphism)
// - Method Overloading.....

class Calculator {

    int sum(int a, int b) {
        return a + b;
    }

    float sum(float a, float b) {
        return a + b;
    }

    int sum(int a, int b, int c) {
        return a + b + c;
    }
}

// Run Time Polymorphism (Dynamic Polymorphism)
// - Method Overriding......

class Animal {
    void eat() {
        System.out.println("Eats is anythings...");
    }
}

class Deer extends Animal {
    void eat() {
        System.out.println("Eats is grass...");
    }
}
