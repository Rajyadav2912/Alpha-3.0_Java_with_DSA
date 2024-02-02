
public class _Super {
    public static void main(String[] args) {
        Horse H = new Horse();
        // H.color;
        System.out.println(H.color);
    }
}

class Animal {
    String color;

    Animal() {
        System.out.println("Animal constructor is called...");
    }
}

class Horse extends Animal {

    Horse() {
        super.color = "Brown";
        System.out.println("Horse constructor is called...");
    }
}
