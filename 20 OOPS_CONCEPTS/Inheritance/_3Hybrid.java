public class _3Hybrid {

    public static void main(String[] args) {
        Dog Dobby = new Dog();
        Dobby.dog();
        Dobby.eat();
        Dobby.legs = 4;
        System.out.println("Dobby legs is : " + Dobby.legs);
        Dobby.breathe();

        System.out.println();

        Parrot Mitthu = new Parrot();
        Mitthu.color();
        Mitthu.leg = 2;
        System.out.println(Mitthu.leg);
        Mitthu.color = "white";
        System.out.println(Mitthu.color);

    }
}

class Animal {
    String color;

    void eat() {
        System.out.println("Eats");
    }

    void breathe() {
        System.out.println("Breathe");
    }
}

class Fish extends Animal {
    int fins;
}

class Tuna {
    void tuna() {
        System.out.println("Streamling Fish....");
    }
}

class Shark {
    void shark() {
        System.out.println("Shark is a big fish....");
    }
}

class Bird extends Animal {
    int leg;
}

class Peacock extends Bird {
    void peacock() {
        System.out.println("Peacock voice is very sweet....");
    }

    void color() {
        System.out.println("Peacock color is purple....");
    }
}

class Parrot extends Bird {
    void parrot() {
        System.out.println("Parrot is looking good...");
    }

    void color() {
        System.out.println("Parrot color is green....");
    }
}

class Mammals extends Animal {
    int legs;
    int eyes;

    void breathe() {
        System.out.println("Breathes.....");
    }
}

class Dog extends Mammals {
    void dog() {
        System.out.println("Dogs are very intelligent....");
    }

    void eat() {
        System.out.println("Dog is eating padegrry...");
    }
}

class Cat extends Mammals {

    void cat() {
        System.out.println("Cats voice is very preety...");
    }

    void eat() {
        System.out.println("Cat is eating a mixing roti with milk....");
    }
}

class Human extends Mammals {
    void human() {
        System.out.println("Humans are very kind and helper.....");
    }

    void eat() {
        System.out.println("Humans is eating a vagetables and street food....");
    }
}
