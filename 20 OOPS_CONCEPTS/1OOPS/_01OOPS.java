
public class _01OOPS {
    public static void main(String[] args) {
        /*
         * Pen p1 = new Pen(); // created a pen object called p1
         * // setters
         * // p1.setcolor("Blue");
         * // System.out.println(p1.color);
         * 
         * // p1.settip(5);
         * // System.out.println(p1.tip);
         * 
         * // p1.color = "yellow";
         * // System.out.println(p1.color);
         * 
         * // p1.tip = 3;
         * // System.out.println(p1.tip);
         * 
         * // getters
         * 
         * p1.setcolor("Blue");
         * System.out.println(p1.getcolor());
         * 
         * p1.settip(5);
         * System.out.println(p1.gettip());
         * 
         * p1.setcolor("Yellow");
         * System.out.println(p1.getcolor());
         * 
         * BankAccount myAcc = new BankAccount();
         * myAcc.UserName = "Rajyadav";
         * myAcc.setpassword = ("abcd");
         * }
         */
        /*
         * Fruits F1 = new Fruits(); // created a fruits objects is f1
         * F1.setname("Mango");
         * // System.out.println("What is name of this fruit: " + F1.name);
         * F1.setcolor("yellow");
         * F1.setprice(50);
         * F1.setweight(50);
         * 
         * // Fruits f2 = new Fruits();
         * // f2.setcolor("banana");
         * // f2.setcolor("yellow");
         * // f2.setprice(10);
         * // f2.setweight(10);
         * 
         */

        Pen P1 = new Pen();
        P1.setcolor("red");
        System.out.println(P1.getcolor());
        P1.settip(1);
        System.out.println(P1.gettip());
    }
}

class Fruits {
    String name;
    String color;
    float weight;
    int price;

    // Functions
    void setname(String Newname) {
        name = Newname;
        System.out.println("What is name of this fruit: " + name);
    }

    void setcolor(String Newcolor) {
        color = Newcolor;
        System.out.println("what is the color of this fruit: " + color);

    }

    void setweight(float New_weight) {
        weight = New_weight;
        if (weight < 100) {
            System.out.println("How much weight of this fruit: " + weight + " gm");
        } else {
            System.out.println("How much weight of this fruit: " + weight + "kg");

        }
    }

    void setprice(int New_price) {
        price = New_price;
        System.out.println("How much price of this fruit: " + price + "rs");
    }

}

class BankAccount {
    public String UserName;
    // private String password;

    // default void setpassword(String Pwd) {
    // password = Pwd;
    // }
}

class Pen {
    private String color;
    private int tip;

    // getters
    String getcolor() {
        return this.color;
    }

    int gettip() {
        return this.tip;
    }

    // setters
    void setcolor(String newcolor) {
        color = newcolor;
    }

    void settip(int newtip) {
        tip = newtip;
    }
}
