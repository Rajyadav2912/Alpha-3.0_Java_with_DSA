public class _4Multilvl {
    public static void main(String[] args) {
        // Fish shark = new Fish();
        // shark.eat();
        Dog Dobby = new Dog();
        Dobby.eat();
        Dobby.legs = 4;
        System.out.println(Dobby.legs);
    }
}

// Multi level Inheritance

// Base class
class Animal {
    String color;

    void eat() {
        System.out.println("Eats");
    }

    void breathe() {
        System.out.println("Breathes");
    }
}

// Derived class
class Mammals extends Animal {
    int legs;
}

// Derived class
class Dog extends Mammals {
    int breed;
}
