
public class _2Hierarchial {
    public static void main(String[] args) {
        Fish shark = new Fish();
        shark.eat();
        shark.breathe();
        shark.swim();
        // shark.fly();
        // Dog Dobby = new Dog();
        // Dobby.eat();
        // Dobby.legs = 4;
        // System.out.println(Dobby.legs);
    }
}

// Hierarchial Inheritance

class Animal {
    String color;

    void eat() {
        System.out.println("Eats");
    }

    void breathe() {
        System.out.println("Breathes");
    }
}

class Mammals extends Animal {
    void walk() {
        System.out.println("Walks");
    }
}

class Fish extends Animal {
    void swim() {
        System.out.println("Swims");
    }
}

class Bird extends Animal {
    void fly() {
        System.out.println("Fly in sky...");
    }
}
