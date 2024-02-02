public class _1inheritance {
    public static void main(String[] args) {
        Fish shark = new Fish();
        shark.eat();
        // Dog Dobby = new Dog();
        // Dobby.eat();
        // Dobby.legs = 4;
        // System.out.println(Dobby.legs);
    }
}

// Single level Inheritance

// Base class

class Animal {
    String color;

    void eat() {
        System.out.println("eats");
    }

    void breathe() {
        System.out.println("breathes");
    }
}

// Derived class
class Fish extends Animal {
    int Fins;

    void swim() {
        System.out.println("Swims in water");
    }
}
